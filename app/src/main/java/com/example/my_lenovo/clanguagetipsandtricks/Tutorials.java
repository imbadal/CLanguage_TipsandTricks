package com.example.my_lenovo.clanguagetipsandtricks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tutorials extends AppCompatActivity {
    private static TextView c_overview;
    private static TextView c_datatypes;
    private static TextView c_operators;
    private static TextView c_controlstructure;
    private static TextView c_pointers;
    private static TextView c_arrays;
    private static TextView c_dynamicmemory;
    private static TextView c_function;
    private static TextView c_storageclass;
    private static TextView c_preprocessors;
    private static TextView c_structureandunion;
    private static TextView c_files;
    private static TextView c_miscellaneous;
    private static TextView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);

        OnClickOverview();
        OnClickDatatypes();
        OnClickOperators();
        OnClickControlStructure();
        OnClickPointers();
        OnClickArrays();
        OnClickDynamicMemory();
        OnClickFunction();
        OnClickStorageClasses();
        OnClickPreProcessors();
        OnClickStructureAndUnion();
        OnClickFiles();
        OnClickMiscellaneous();


    }

    public void OnClickOverview() {

        c_overview = (TextView) findViewById(R.id.overview);
        c_overview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent("com.example.my_lenovo.clanguagetipsandtricks.Overview");
                startActivity(intent1);
            }
        });

    }

    public void OnClickDatatypes() {

        c_datatypes = (TextView) findViewById(R.id.datatypes);
        c_datatypes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent("com.example.my_lenovo.clanguagetipsandtricks.Datatypes");
                startActivity(intent1);
            }
        });

    }

    public void OnClickOperators() {

        c_operators = (TextView) findViewById(R.id.operators);
        c_operators.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.my_lenovo.clanguagetipsandtricks.Operators");
                startActivity(intent);
            }
        });

    }

    public void OnClickControlStructure() {

        c_controlstructure = (TextView) findViewById(R.id.control_structure);
        c_controlstructure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.my_lenovo.clanguagetipsandtricks.ControlStructure");
                startActivity(intent);
            }
        });

    }

    public void OnClickPointers() {

        c_pointers = (TextView) findViewById(R.id.pointers);
        c_pointers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.my_lenovo.clanguagetipsandtricks.Pointers");
                startActivity(intent);
            }
        });

    }

    public void OnClickArrays() {

        c_arrays = (TextView) findViewById(R.id.arrays);
        c_arrays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.my_lenovo.clanguagetipsandtricks.Arrays");
                startActivity(intent);
            }
        });

    }

    public void OnClickDynamicMemory() {

        c_dynamicmemory = (TextView) findViewById(R.id.dynamic_memory);
        c_dynamicmemory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.my_lenovo.clanguagetipsandtricks.DynamicMemory");
                startActivity(intent);
            }
        });
    }

    public void OnClickFunction() {

        c_function = (TextView) findViewById(R.id.function);
        c_function.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.my_lenovo.clanguagetipsandtricks.Function");
                startActivity(intent);
            }
        });
    }
    public void OnClickStorageClasses() {

        c_storageclass = (TextView) findViewById(R.id.storage_classes);
        c_storageclass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.my_lenovo.clanguagetipsandtricks.StorageClass");
                startActivity(intent);
            }
        });
    }

    public void OnClickPreProcessors() {

        c_preprocessors = (TextView) findViewById(R.id.pre_processors);
        c_preprocessors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.my_lenovo.clanguagetipsandtricks.PreProcessors");
                startActivity(intent);
            }
        });
    }

    public void OnClickStructureAndUnion() {

        c_structureandunion = (TextView) findViewById(R.id.structure_and_union);
        c_structureandunion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.my_lenovo.clanguagetipsandtricks.StructureAndUnion");
                startActivity(intent);
            }
        });
    }

    public void OnClickFiles() {

        c_files = (TextView) findViewById(R.id.files);
        c_files.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.my_lenovo.clanguagetipsandtricks.Files");
                startActivity(intent);
            }
        });
    }

    public void OnClickMiscellaneous() {

        c_miscellaneous = (TextView) findViewById(R.id.miscellaneous);
        c_miscellaneous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.my_lenovo.clanguagetipsandtricks.Miscellaneous");
                startActivity(intent);
            }
        });
    }

}