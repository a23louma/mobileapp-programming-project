
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
