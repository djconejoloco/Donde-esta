package com.example.botonunico;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//creamos boton con final para poder modificar el contenido no el boton
		final Button boton=(Button) findViewById(R.id.button1);
		
		//Damos al boton  un lister 
		boton.setOnClickListener(new Button.OnClickListener(){
		//hacemos que el boton con un clic cambie su nombre capturandolo.	
			public void onClick(View v){
				try{
				//creamos variable textview para capturar el edittext
				TextView temp;
				temp=(TextView)findViewById(R.id.editText1);
				// creamos una variable string para capturar la variable textview y pasarla a string
				
				String a=temp.getText().toString();
				
				Intent mapa=new Intent(
					android.content.Intent.ACTION_VIEW,
					//añadimos la variable string para la busqueda
					Uri.parse("geo:0,0?q="+ a)
				);
				startActivity(mapa);
				}catch(Exception e){
					
				}
				}
				
		}
		);
						
			}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
