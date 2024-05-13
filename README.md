
# Rapport

Skiss/design-idé

Webbtjänst - JSON
Jag lade in min apps JSON-data via admin-gränssnittet på kursens webbtjänst. Jag valde att lägga in
10 JSON-objekt till JSON-arrayen där attributen ID, Login, Name, Size, Location, Cost och Company
användes. Förutom ID och mitt login representerade attributen akvariefiskarnas namn, längd i cm, 
härkomst, svårighetsgrad och lämplig vattentemperatur. 


Jag lade till en recyclerview i activity_main.
```
    <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/recycler_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
```
Därefter skapade jag en ny layout-fil som jag namngav recyclerviewitem. Jag lade in en TextView i
layout-filen. Se koden nedan.
```
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/recycler_view_item_title"/>
```

Därefter skapade jag RecyclerViewAdapter-klassen där jag även behövde skapa ViewHolder-klassen. Jag
lade till nödvändig kod i dessa klasser. I MainActivity skapade jag ett adapter-objekt. Se koden nedan.
```
        adapter = new RecyclerViewAdapter(this, items, new RecyclerViewAdapter.OnClickListener() {
            @Override
            public void onClick(RecyclerViewItem item) {
                Log.d("Klickat", "item");
            }
```
Jag skapade även RecyclerViewItem-klassen. Jag lade till de attribut som behövdes för min JSON-data
samt tillhörande getters-metoder. Se koden nedan.

```
    @ SerializedName ("ID")
    private String title;
    private String name;
    @ SerializedName ("location")
    private String origin;
    @ SerializedName ("size")
    private int sizeInCentimeters;
    @ SerializedName ("cost")
    private int waterTemperature;
    @ SerializedName ("company")
    private int difficulty;
```
I AndroidManifest.xml möjliggjorde jag internetåtkomst genom att lägga till följande kodrad.
```
<uses-permission android:name="android.permission.INTERNET" />
```

Jag skapade en klassen JsonTask och kopierade koden för denna klass från Canvas.

I MainActivity behövde jag extenda JsonTaskListener. Jag lade till metoden OnPostExecute.

```
    @Override
    public void onPostExecute(String json) {
        Log.d("Berg MainActivity", json);
        Type type = new TypeToken<ArrayList<RecyclerViewItem>>() {}.getType();
        items = gson.fromJson(json, type);
        for(RecyclerViewItem r : items) {
            Log.d("Fisk_items onPE", r.getTitle() + "");
        }
        adapter.updateData(items);
        Log.d("Fisk items", "" + items.size());
    }
```
I RecyclerViewAdapter lade jag till metoden updateData.
```
    public void updateData(ArrayList<RecyclerViewItem> newItems) {
        items.clear();
        items.addAll(newItems);
        Log.d("Fisk items_updateData", "" + items.size());
        for(RecyclerViewItem r : newItems)
            Log.d("Fisk", r.getTitle() + "");
        notifyDataSetChanged();
    }
```    

Jag hade problem med att bara ett objekt från JSON-arrayen visades. Efter att jag ändrade layout-
height till wrap content i recyclerviewitem.xml visades alla 10 objekt upp.
```
android:layout_height="wrap_content">
```

Jag skapade en ny Empty View Activity som jag namngav SecondActivity för ABOUT-skärmen. Jag skapade
även tillhörande xml-fil och tog bort all onödig kod från SecondActivity. Jag fick felmeddelanden
efter att detta var gjort och jag behövde gå in i build gradle och ändra versionen för activity samt
minSdkVersion till 26. Se koden nedan.
```
implementation 'androidx.activity:activity:1.2.0'
```
Jag lade till en knapp i activity_main för att kunna öppna SecondActivity. I strings.xml lade jag
till button-texten.
```
    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        android:id="@+id/openSecondActivityButton"
        app:layout_constraintBottom_toTopOf="@id/recycler_view"
        android:text="@string/button_about"/>
```

Implementationsexempel

Implementationsexempel VG (för de som satsar på VG) 

Reflektion



```
```

```
```

```
```

Bilder läggs i samma mapp som markdown-filen.

![](android.png)
