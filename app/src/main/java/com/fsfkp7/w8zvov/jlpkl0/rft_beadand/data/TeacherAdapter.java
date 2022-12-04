package com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ISubject;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.R;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class TeacherAdapter extends ArrayAdapter<ITeacher> {
    private List<ITeacher> teachers;


    public TeacherAdapter(@NonNull Context context, int resource, List<ITeacher> teachers) {
        super(context, resource, teachers);
        this.teachers = teachers;

    }


    Filter myFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults filterResults = new FilterResults();
            ArrayList<ITeacher> tempList=new ArrayList<ITeacher>();
            //constraint is the result from text you want to filter against.
            //objects is your data set you will filter from
            if(constraint != null && teachers!=null) {
                int length=teachers.size();
                int i=0;

                while(i<length){
                    ITeacher item=teachers.get(i);
                    //do whatever you wanna do here
                    //adding result set output array
                    String REGEX = "^"+constraint+".*$";
                    boolean matcher = Pattern.matches(REGEX, item.name.toLowerCase());
                    if(matcher){
                        tempList.add(item);
                    }else{

                        int sublength=item.subjects.size();
                        int si=0;
                        while(si<sublength){
                            boolean matcher2 = Pattern.matches(REGEX, item.subjects.get(si).name.toLowerCase());
                            if(matcher2){
                                tempList.add(item);
                            break;}
                            si++;
                        }
                    }



                    i++;
                }
                //following two lines is very important
                //as publish result can only take FilterResults objects
                filterResults.values = tempList;
                filterResults.count = tempList.size();
            }
            return filterResults;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void publishResults(CharSequence contraint, FilterResults results) {
            teachers = (ArrayList<ITeacher>) results.values;
            if (results.count > 0) {
                notifyDataSetChanged();
            } else {
                notifyDataSetInvalidated();
            }
        }
    };


    @Override
    public Filter getFilter() {
        return myFilter;
    }

    @Override
    public int getCount() {
        return teachers.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.teaching_items,parent,false);
        }
        ArrayList<ISubject> subjectList;
        Button btn_update;
        ListView subject_list;

        subjectList = new ArrayList<>();

        /**
         * putting all te subjects into an arraylist
*/
        for (int i = 0; i < teachers.get(position).subjects.size(); i++){
            subjectList.add(teachers.get(position).subjects.get(i));
        }

        /**
         * Displaying subjects on activity_profile using adapters.
*/

        SubjectAdapter adapter = new SubjectAdapter(convertView.getContext(), R.layout.list_item, subjectList);
        ListView listView = convertView.findViewById(R.id.listView_subjects);
        listView.setAdapter(adapter);




        TextView name = convertView.findViewById(R.id.Name);
        Button email = convertView.findViewById(R.id.Email);
        Button phoneNumber = convertView.findViewById(R.id.PhoneNumber);


        name.setText(teachers.get(position).name);
        email.setText(teachers.get(position).email);
        phoneNumber.setText(teachers.get(position).phoneNumber);




        phoneNumber.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                String number = teachers.get(position).phoneNumber;
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" +number));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getContext().startActivity(intent);





            }
        });

        email.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                String email = teachers.get(position).email;
                Intent mailIntent = new Intent(Intent.ACTION_SENDTO);
                mailIntent.setData(Uri.parse("mailto:" + email));
                mailIntent.putExtra(Intent.EXTRA_EMAIL, email);
                mailIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getContext().startActivity(mailIntent);
                //  getContext().startActivity(Intent.createChooser(mailIntent, getContext().getString(R.string.email)));





            }
        });
        return convertView;
    }
}
