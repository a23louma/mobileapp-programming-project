
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
