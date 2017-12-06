package com.example.dialog;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	private Button btn=null,btn2=null,btn3=null;
	private AlertDialog.Builder builder=null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn=(Button)findViewById(R.id.button1);
		builder=new AlertDialog.Builder(this);
		builder.setTitle("ɾ��ȷ��");
		builder.setMessage("��ȷ��ɾ��������Ϣ��");
		builder.setIcon(R.drawable.ic_launcher);
		builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Toast.makeText(MainActivity.this, "��ȡ����", Toast.LENGTH_LONG).show();				
			}
		});
		builder.setPositiveButton("ȷ��", new DialogInterface.OnClickListener() {
			
			@SuppressLint("ShowToast")
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Toast.makeText(MainActivity.this, "�Ѿ�ɾ������", Toast.LENGTH_LONG).show();
			}
		});
		btn2=(Button)findViewById(R.id.button2);
		btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
				builder.setTitle("��ѡ�񰮺�");
				final String[] hobby={"����","��Ӿ","����Ϸ"};
				builder.setMultiChoiceItems(hobby, new boolean[]{true,false,false}, new DialogInterface.OnMultiChoiceClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which, boolean isChecked) {
						if(isChecked){
						Toast.makeText(MainActivity.this,hobby[which], Toast.LENGTH_LONG).show();
						}
					}
				});
				builder.setPositiveButton("ȷ��", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
					}
					
				});
				builder.setNegativeButton("ȡ��", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
					}
					
				});
				builder.show();
			}
		});
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				builder.show();
			}
		});
		btn3=(Button)findViewById(R.id.button3);
		btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
				builder.setTitle("��ѡ��");
				builder.setSingleChoiceItems(new String[]{"��","Ů"}, 0, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				} );
				builder.setPositiveButton("ȷ��", null);
				builder.setNegativeButton("ȡ��", null);
				builder.show();
			}
		});
		
	}

}
