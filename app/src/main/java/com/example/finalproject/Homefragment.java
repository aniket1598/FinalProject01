package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class Homefragment extends Fragment {


    private GridLayout gridLayout;
   private CardView cardView;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view= inflater.inflate(R.layout.fragment_home, container, false);

         gridLayout=view.findViewById(R.id.homegrid);
      setSingleEvent(gridLayout);

        return view;

    }

  private void setSingleEvent(GridLayout gridLayout) {

      for(int i=0; i<gridLayout.getChildCount();i++){
         CardView cardView=(CardView)gridLayout.getChildAt(i);
         final int final1=i;

         cardView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
             if(final1==0){
                 Intent intent = new Intent(Homefragment.this.getContext(),Activityone.class);
                 startActivity(intent);
             }

             else if(final1==1){
               Intent intent=new Intent(Homefragment.this.getContext(),Activitytwo.class);//we can also use super.getcontext(),class name
               startActivity(intent);
             }
           }
         });
    }
  }


}



