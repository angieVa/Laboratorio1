package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import model.Sort;

public class InicioController {
		
	
		Sort sort1 = new Sort(0,0,0,0,0,0 );
	 	@FXML
	    private Button butOrder;

	    @FXML
	    private Button butAdd;

	    @FXML
	    private TextField txtData;

	    @FXML
	    private Label labelTime;

	    @FXML
	    private TextField txtIntervalU;

	    @FXML
	    private RadioButton rbNoRepeat;

	    @FXML
	    private ToggleGroup type;

	    @FXML
	    private RadioButton rbPercentage;

	    @FXML
	    private TextField txtPercentage;

	    @FXML
	    private ListView<Double> listValues= new ListView<Double>();

	    @FXML
	    private RadioButton rbRepeat;

	    @FXML
	    private RadioButton rbRandomOrder;

	    @FXML
	    private Button butOrder2;

	    @FXML
	    private Button butGenerate;

	    @FXML
	    private ToggleGroup repeat;

	    @FXML
	    private TextField txtValues;

	    @FXML
	    private RadioButton rbReverseOrder;

	    @FXML
	    private TextField txtIntervalL;

	    @FXML
	    private RadioButton rbOrderedValues;
	    
		ObservableList<Double> items =FXCollections.observableArrayList(); 

	    @FXML
	    void AddValues(ActionEvent event) {

	    }

	    @FXML
	    void Order1(ActionEvent event) {

	    }

	    @FXML
	    void  Data(ActionEvent event) {

	    }

	    @FXML
	    void Order2(ActionEvent event) {
	    	
	    	int quantity = items.size();

	    	double[] array = new double[quantity];
	    	
	    		for(int i = 0; i< items.size(); i++) {
	    			
	    			array[i] = items.get(i);
	    		}
	    		
	    		
	    	
	    	if(quantity <= 500) {
				
				sort1.insertionSort(array);
				
			} else if(quantity > 500 && quantity <= 100000) {
				
				sort1.combSort(array);	
				
			} else {
				
				sort1.shellSort(array);
				
			}
	    	
	    	items.remove(0, quantity);
	    	
	    	for(int i = 0; i< array.length; i++) {
	    		items.add(array[i]);
	    	}
	    	
	    	listValues.setItems(items);
	    	
	    	
	    }

	    @FXML
	    void GenerateNumbers(ActionEvent event) {
	    	int option = 0;
	    	int optionRandom = 0;
	    	double rank1 = 0;
	    	double rank2 = 0;
	    	double percentage = 0;
	    	int quantity = 0;
	    	
	    	if(rbRepeat.isSelected()==true){
	    		
	    		option = 0;
	    		
	    		
	    	}else if(rbNoRepeat.isSelected()== true) {
	    		option = 1;
	    			
	    	}
	    	
	    	rank1 = Double.parseDouble(txtIntervalL.getText());
	    	rank2 = Double.parseDouble(txtIntervalU.getText());
	    	percentage = Double.parseDouble(txtPercentage.getText())/100;
	    	quantity = Integer.parseInt(txtData.getText());
	    	
	    	if(rbRandomOrder.isSelected() == true) {
	    		optionRandom = 1;
	    		
	    	}else if(rbOrderedValues.isSelected() == true) {
	    		optionRandom = 2;
	    		
	    	}else if(rbReverseOrder.isSelected() == true) {
	    		optionRandom = 3;
	    		
	    	}else if(rbPercentage.isSelected() == true) {
	    		optionRandom = 4;
	    		
	    	}
	    	
	    	Sort sort = new Sort( quantity, rank1, rank2, option, optionRandom, percentage);
	    	
	    	
	  
	    	for(int i = 0; i < quantity; i++) {
	    		items.add(sort.getArray()[i]);
	    		
	    	}
	    	
	    	listValues.setItems(items);
	    	
	    	
	    }
}
