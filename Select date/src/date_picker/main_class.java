package date_picker;
import date_picker.Select_date;

public class main_class {
	public static void main(String[] args) throws InterruptedException {
		Select_date.setupTest();
		Select_date.login();
		Select_date.addProduct();
		
		Select_date date= new Select_date();
		date.datePickerTest();
		
		Select_date.uploadFile();
		Select_date.submit();
		Select_date.quitDriver();
		
	}
}
