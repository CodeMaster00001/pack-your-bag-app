package com.ankit.packyourbag.Data;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import com.ankit.packyourbag.Constants.MyConstants;
import com.ankit.packyourbag.Database.RoomDB;
import com.ankit.packyourbag.Models.Items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppData extends Application {

    RoomDB database;
    String category;
    Context context;

    public static final String LAST_VERSION="LAST_VERSION";
    public static final int NEW_VERSION=1;

    public AppData(RoomDB database) {
        this.database = database;
    }

    public AppData(RoomDB database, Context context) {
        this.database = database;
        this.context = context;
    }

    public List<Items> getBasicData(){
        category="Basic Needs";
        List<Items> basicItem=new ArrayList<>();
        basicItem.clear();
        basicItem.add(new Items("Visa", category, false));
        basicItem.add(new Items("Passport", category, false));
        basicItem.add(new Items("Tickets", category, false));
        basicItem.add(new Items("Wallet", category, false));
        basicItem.add(new Items("Driving License", category, false));
        basicItem.add(new Items("Currency", category, false));
        basicItem.add(new Items("House Key", category, false));
        basicItem.add(new Items("Book", category, false));
        basicItem.add(new Items("Travel Pillow", category, false));
        basicItem.add(new Items("Eye Patch", category, false));
        basicItem.add(new Items("Umbrella", category, false));
        basicItem.add(new Items("Note Book", category, false));
        return basicItem;
    }

    public List<Items> getPersonalCareData(){
        String[] data={"Tooth-brush", "Tooth-paste", "Floss", "Mouthwash", "Shaving Cream", "Razor Blade",
                "Soap", "Fiber", "Shampoo", "Hair Conditioner", "Brush", "Comb", "Hair Dryer", "Curling Iron",
                "Hair Moulder", "Hair Clip", "Moisturizer", "Lip Cream", "Contact Lens", "Perfume", "Deodorant",
                "Makeup Materials", "Makeup Remover", "Wet Wipes", "Pad", "Ear Stick", "Cotton", "Nail Polish",
                "Nail Polish Remover", "Tweezers", "Nail Scissors", "Nail Files", "Suntan Crea"};
        return prepareItemsList(MyConstants.PERSONAL_CARE_CAMEL_CASE, data);
    }
    public List<Items> getClothingData(){
        String[] data={"Stockings", "Underwear", "Pajamas", "T-Shirts", "casual Dress", "Evening Dress",
                "Shirt", "Cardigan", "Vest", "Jacket", "Skirt", "Trousers", "Jeans", "Shorts", "Suit",
                "Coat", "Rain Coat", "Glove", "Hat", "Scarf", "Bikini", "Belt", "Slipper", "Sneakers",
                "Casual Shoes", "Heeled Shoes", "Sports Wear"};
        return prepareItemsList(MyConstants.CLOTHING_CAMEL_CASE, data);
    }
    public List<Items> getBabyNeedsData(){
        String[] data={"Snapsuit", "Outfit", "Jumpsuit", "Baby Socks", "Baby Hat", "Baby Pyjamas",
                "Baby Bath Towel", "Muslin", "Blanket", "Dribble Bibs", "Baby Laundry Detergent",
                "Baby Bottles", "Baby Food Thernos", "Baby Bottle Brushes", "Breast-feeding Cover",
                "Breast Pump", "Water Bottle", "Storage Container", "Baby Food Spoon", "Highchairs",
                "Diaper", "Wet Wipes", "Baby Cotton", "Baby Care Cover", "Baby Shampoo", "Baby soap",
                "Baby Nail Scissors", "Body Moisturizer", "Poty", "Diaper Rash Cream", "Serum Physiological",
                "Nasal Aspirator", "Stroller", "Baby Carrier", "Toys", "Teether", "Playpen", "baby Radio",
                "Non-slip Sea Shoes", "Baby Sunglasses"};
        return prepareItemsList(MyConstants.BABY_NEEDS_CAMEL_CASE, data);
    }
    public List<Items> getHealthData(){
        String[] data={"Aspirin", "Drugs Used", "Vitamins Used", "Lens Solutions", "Condom", "Hot Water Bag",
                "Tincture Of Iodine", "Adhesive Plaster", "First Aid Kit", "Replacement Lens", "Pain Reliever",
                "Fever Reducer", "Diarrhea Stopper", "Pain Reliever Spray"};
        return prepareItemsList(MyConstants.HEALTH_CAMEL_CASE, data);
    }
    public List<Items> getTechnologyData(){
        String[] data={"Mobile Phone", "Pohone Cover", "E-Book Reader", "Camera", "Camera Charger",
                "Portable Speaker", "IPad(Tab", "Headphone", "Laptop", "Laptop Charger", "Mouse",
                "Extension Cable", "Data Transfer Cable", "Battery", "Power Bank", "DVD Player",
                "Flash-Light", "MP3 Player", "MP3 Player Charger", "Voltage Adapter", "SD Card"};
        return prepareItemsList(MyConstants.TECHNOLOGY_CAMEL_CASE, data);
    }
    public List<Items> getFoodData(){
        String[] data={"Snack", "Sandwich", "Juice", "Tea Bags", "Coffee", "Water", "Thermos",
                "Chips", "baby Food"};
        return prepareItemsList(MyConstants.FOOD_CAMEL_CASE, data);
    }
    public List<Items> getBeachSuppliesData(){
        String[] data={"Sea Glasses", "Sea Bed", "Suntan Cream", "Beach Umbrella", "Swim Fins", "Beach Bag",
                "Beach Towel", "Beach Slippers", "Sunbed", "Snorkel", "Waterproof Clock"};
        return prepareItemsList(MyConstants.BEACH_SUPPLIES_CAMEL_CASE, data);
    }
    public List<Items> getCarSuppliesData(){
        String[] data={"Pump", "Car Jack", "Spare Car key", "Accident Record Set", "Auto Refrigerator",
                "Car Cover", "Car Charger", "Window Sun Shades"};
        return prepareItemsList(MyConstants.CAR_SUPPLIES_CAMEL_CASE, data);
    }
    public List<Items> getNeedsData(){
        String[] data={"Backpack", "Daily bags", "Laundry Bag", "Sewing kit", "Travel Lock",
                "Luggage Tag", "Magazine", "Sports Equipment", "Import Numbers"};
        return prepareItemsList(MyConstants.NEEDS_CAMEL_CASE, data);
    }

    public List<Items> prepareItemsList(String category, String  []data){
        List<String> list= Arrays.asList(data);
        List<Items> dataList=new ArrayList<>();
        dataList.clear();

        for(int i=0; i<list.size(); i++){
            dataList.add(new Items(list.get(i), category, false));
        }
        return dataList;
    }

    public List<List<Items>> getAllData(){
        List<List<Items>> listOfAllItems=new ArrayList<>();
        listOfAllItems.clear();
        listOfAllItems.add(getBasicData());
        listOfAllItems.add(getClothingData());
        listOfAllItems.add(getPersonalCareData());
        listOfAllItems.add(getBabyNeedsData());
        listOfAllItems.add(getHealthData());
        listOfAllItems.add(getTechnologyData());
        listOfAllItems.add(getFoodData());
        listOfAllItems.add(getBeachSuppliesData());
        listOfAllItems.add(getCarSuppliesData());
        listOfAllItems.add(getNeedsData());
        return listOfAllItems;
    }
    public void persistAllData(){
        List<List<Items>> listOfAllItems=getAllData();
        for(List<Items> list: listOfAllItems){
            for(Items items: list){
                database.mainDao().saveItem(items);
            }
        }
        System.out.println("Data added.");
    }

    public void persistDataByCategory(String category, Boolean onlyDelete){
        try{
            List<Items> list=deleteAndGetListByCategory(category, onlyDelete);
            if(!onlyDelete){
                for(Items item: list){
                    database.mainDao().saveItem(item);
                }
                Toast.makeText(context, "Reset Successfully.", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(context, "Reset Successfully.", Toast.LENGTH_SHORT).show();
            }
        }catch(Exception ex){
            ex.printStackTrace();
            Toast.makeText(context, "Something Went Wrong", Toast.LENGTH_SHORT).show();
        }
    }

    private List<Items> deleteAndGetListByCategory(String category, Boolean onlyDelete){
        if(onlyDelete){
            database.mainDao().deleteAllByCategoryAndAddedBy(category, MyConstants.SYSTEM_SMALL);
        }else{
            database.mainDao().deleteAllByCategory(category);
        }

        switch(category){
            case MyConstants.BASIC_NEEDS_CAMEL_CASE:
                return getBasicData();
            case MyConstants.CLOTHING_CAMEL_CASE:
                return getClothingData();
            case MyConstants.PERSONAL_CARE_CAMEL_CASE:
                return getPersonalCareData();
            case MyConstants.BABY_NEEDS_CAMEL_CASE:
                return getBabyNeedsData();
            case MyConstants.HEALTH_CAMEL_CASE:
                return getHealthData();
            case MyConstants.TECHNOLOGY_CAMEL_CASE:
                return getTechnologyData();
            case MyConstants.FOOD_CAMEL_CASE:
                return getFoodData();
            case MyConstants.BEACH_SUPPLIES_CAMEL_CASE:
                return getBeachSuppliesData();
            case MyConstants.CAR_SUPPLIES_CAMEL_CASE:
                return getCarSuppliesData();
            case MyConstants.NEEDS_CAMEL_CASE:
                return getNeedsData();
            default:
                return new ArrayList<>();
        }
    }
}
