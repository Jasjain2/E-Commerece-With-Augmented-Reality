package com.abc.ecommerceapp.activities;

import static com.abc.ecommerceapp.R.*;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.RecoverySystem;

import com.abc.ecommerceapp.R;
import com.abc.ecommerceapp.adapters.ShowAllAdapter;
import com.abc.ecommerceapp.models.ShowAllModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class ShowAllActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ShowAllAdapter showAllAdapter;
    List<ShowAllModel> showAllModelList;

    Toolbar toolbar;

    FirebaseFirestore firestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all);

        toolbar = findViewById(R.id.show_all_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String type = getIntent().getStringExtra("type");

        firestore = FirebaseFirestore.getInstance();
        recyclerView = findViewById(id.show_all_rec);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        showAllModelList = new ArrayList<>();
        showAllAdapter = new ShowAllAdapter(this, showAllModelList);
        recyclerView.setAdapter(showAllAdapter);


        if (type == null || type.isEmpty()) {
            firestore.collection("ShowAll")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if (task.isSuccessful()) {
                                for (DocumentSnapshot doc : task.getResult().getDocuments()) {

                                    ShowAllModel showAllModel = doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }
                        }
                    });

        }

        if (type != null && type.equalsIgnoreCase("Men")) {
            firestore.collection("ShowAll").whereEqualTo("type", "Men")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if (task.isSuccessful()) {
                                for (DocumentSnapshot doc : task.getResult().getDocuments()) {

                                    ShowAllModel showAllModel = doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }
                        }
                    });
        }

        if (type != null && type.equalsIgnoreCase("Woman")) {
            firestore.collection("ShowAll").whereEqualTo("type", "Woman")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if (task.isSuccessful()) {
                                for (DocumentSnapshot doc : task.getResult().getDocuments()) {

                                    ShowAllModel showAllModel = doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }
                        }
                    });
        }

//        if (type != null && type.equalsIgnoreCase("Watch")) {
//            firestore.collection("ShowAll").whereEqualTo("type", "Watch")
//                    .get()
//                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
//                        @Override
//                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
//
//                            if (task.isSuccessful()) {
//                                for (DocumentSnapshot doc : task.getResult().getDocuments()) {
//
//                                    ShowAllModel showAllModel = doc.toObject(ShowAllModel.class);
//                                    showAllModelList.add(showAllModel);
//                                    showAllAdapter.notifyDataSetChanged();
//                                }
//                            }
//                        }
//                    });
//        }

//        if (type != null && type.equalsIgnoreCase("Kids")) {
//            firestore.collection("ShowAll").whereEqualTo("type", "Kids")
//                    .get()
//                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
//                        @Override
//                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
//
//                            if (task.isSuccessful()) {
//                                for (DocumentSnapshot doc : task.getResult().getDocuments()) {
//
//                                    ShowAllModel showAllModel = doc.toObject(ShowAllModel.class);
//                                    showAllModelList.add(showAllModel);
//                                    showAllAdapter.notifyDataSetChanged();
//                                }
//                            }
//                        }
//                    });
//        }
//        if (type != null && type.equalsIgnoreCase("Camera")) {
//            firestore.collection("ShowAll").whereEqualTo("type", "Camera")
//                    .get()
//                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
//                        @Override
//                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
//
//                            if (task.isSuccessful()) {
//                                for (DocumentSnapshot doc : task.getResult().getDocuments()) {
//
//                                    ShowAllModel showAllModel = doc.toObject(ShowAllModel.class);
//                                    showAllModelList.add(showAllModel);
//                                    showAllAdapter.notifyDataSetChanged();
//                                }
//                            }
//                        }
//                    });
//
//        }
        if (type != null && type.equalsIgnoreCase("Shoes")) {
            firestore.collection("ShowAll").whereEqualTo("type", "Shoes")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if (task.isSuccessful()) {
                                for (DocumentSnapshot doc : task.getResult().getDocuments()) {

                                    ShowAllModel showAllModel = doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }
                        }
                    });
        }
    }
}