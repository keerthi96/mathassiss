/**
 * Created by Keerthi on 18-09-2015.
 */
package com.example.keerthi.mathassiss;
import java.util.ArrayList;
import java.util.List;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DbHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 9;
    // Database Name
    private static final String DATABASE_NAME = "triviaQuiz";
    // tasks table name
    private static final String TABLE_QUEST = "quest";
    private static final String SUBTRACTION = "sub";
    private static final String MULTIPLICATION = "mul";
    private static final String DIVISION = "div";
    private static final String EASY = "easy";
    private static final String MEDIUM = "medium";
    private static final String HARD = "hard";
    // tasks Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_QUES = "question";
    private static final String KEY_ANSWER = "answer"; //correct option
    private static final String KEY_OPTA= "opta"; //option a
    private static final String KEY_OPTB= "optb"; //option b
    private static final String KEY_OPTC= "optc"; //option c
    private SQLiteDatabase dbase;
    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase=db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
                +KEY_OPTB +" TEXT, "+KEY_OPTC+" TEXT)";
        db.execSQL(sql);
        addQuestions();
        String sql2 = "CREATE TABLE IF NOT EXISTS " + SUBTRACTION + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
                +KEY_OPTB +" TEXT, "+KEY_OPTC+" TEXT)";
        db.execSQL(sql2);
        addQuestions2();
        String sql3 = "CREATE TABLE IF NOT EXISTS " + MULTIPLICATION + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
                +KEY_OPTB +" TEXT, "+KEY_OPTC+" TEXT)";
        db.execSQL(sql3);
        addQuestions3();
        String sql4 = "CREATE TABLE IF NOT EXISTS " + DIVISION + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
                +KEY_OPTB +" TEXT, "+KEY_OPTC+" TEXT)";
        db.execSQL(sql4);
        addQuestions4();
        String sql5 = "CREATE TABLE IF NOT EXISTS " + EASY + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
                +KEY_OPTB +" TEXT, "+KEY_OPTC+" TEXT)";
        db.execSQL(sql5);
        addQuestions5();
        String sql6 = "CREATE TABLE IF NOT EXISTS " + MEDIUM + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
                +KEY_OPTB +" TEXT, "+KEY_OPTC+" TEXT)";
        db.execSQL(sql6);
        addQuestions6();
        String sql7 = "CREATE TABLE IF NOT EXISTS " + HARD + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
                +KEY_OPTB +" TEXT, "+KEY_OPTC+" TEXT)";
        db.execSQL(sql7);
        addQuestions7();
//db.close();
    }
    private void addQuestions()
    {
        Question q1=new Question("Joe collects 64 cards. Joe's father gives Joe 28 more."+" How many cards does Joe have?","72", "82", "92", "92");
        this.addQuestion(q1);
        Question q2=new Question("Annie has 73 bananas. Sandra has 56 bananas."+" If Sandra gives all of her bananas to Annie, how many bananas will Annie have?", "129", "127", "123", "129");
        this.addQuestion(q2);
        Question q3=new Question("There are 35 marbles. 27 marbles more are added. How many are there total?","61", "62","63","62");
        this.addQuestion(q3);
        Question q4=new Question("Jeffrey starts with 42 tickets. Andrew gives Jeffrey 29 more. How many tickets does Jeffrey end with?",    "62", "72", "71","71");
        this.addQuestion(q4);
        Question q5=new Question("Ruby has 59 Skittles. She finds another 67. How many Skittles does Ruby have in all?","126","127","128","126");
        this.addQuestion(q5);
    }
    private void addQuestions3()
    {
        Question q1=new Question(" If Ram gives 2 pens each to 20 of his friends, how many pens doid Ram have in total?","30", "40", "50", "40");
        this.addQuestion3(q1);
        Question q2=new Question("If there are 26 students and each student is provided with 4 samplings, how many samplings will be planted?", "86", "96", "104", "104");
        this.addQuestion3(q2);
        Question q3=new Question("In a class,there are 32 tables, there are 23 classes in the school. how many tables are there in school?","724", "726","736","736");
        this.addQuestion3(q3);
     /*   Question q4=new Question("Jeffrey starts with 42 tickets. Andrew gives Jeffrey 29 more. How many tickets does Jeffrey end with?",    "62", "72", "71","71");
        this.addQuestion3(q4);
        Question q5=new Question("Ruby has 59 Skittles. She finds another 67. How many Skittles does Ruby have in all?","126","127","128","126");
        this.addQuestion3(q5);*/
    }
    private void addQuestions4()
    {
        Question q1=new Question("6 apples are being shared by 2 sisters. how many piece should each get?","2", "3", "4", "3");
        this.addQuestion4(q1);
        Question q2=new Question("Seth put 45 photos in his photo album. The album has 9 pages. If each page has the same number of photos, how many photos did Seth put on each page?", "5", "6", "7", "5");
        this.addQuestion4(q2);
        Question q3=new Question("At the toy store, there are 80 model airplanes. The airplanes are evenly divided among 4 shelves. How many model airplanes are on each shelf?","20", "30","40","20");
        this.addQuestion4(q3);
     /*   Question q4=new Question("Jeffrey starts with 42 tickets. Andrew gives Jeffrey 29 more. How many tickets does Jeffrey end with?",    "62", "72", "71","71");
        this.addQuestion4(q4);
        Question q5=new Question("Ruby has 59 Skittles. She finds another 67. How many Skittles does Ruby have in all?","126","127","128","126");
        this.addQuestion4(q5);*/
    }
    private void addQuestions2()
    {
        Question q1=new Question("Paula has 67 apples. 15 are eaten by a hippopotamus. How many apples will Paula have?","62", "52", "42", "52");
        this.addQuestion2(q1);
        Question q2=new Question("There are 58 apples in a box. Louis takes 21 apples. How many are left?", "37", "36", "35", "37");
        this.addQuestion2(q2);
        Question q3=new Question("Roger weighs 64 pounds. Theresa weighs 16 pounds. How much heavier is Roger than Theresa?","52", "48","46","48");
        this.addQuestion2(q3);
        Question q4=new Question("There are 72 erasers in a box. Mary takes 34 erasers. How many are left?",    "42", "34", "38","38");
        this.addQuestion2(q4);
       /* Question q5=new Question("Which of the following is NOT an" +
                " interpreted language?","Ruby","Python","BASIC","Basic");
        this.addQuestion2(q5);*/
    }
    private void addQuestions5()
    {
        Question q1=new Question("What Is 24 x 2?","45", "98", "48", "48");
        this.addQuestion5(q1);
        Question q2=new Question("1318 / 2 ?", "664", "659", "678", "659");
        this.addQuestion5(q2);
        Question q3=new Question("1001 - 101 = ?","1001", "9900","990","9900");
        this.addQuestion5(q3);
        Question q4=new Question("19 + ___ = 42",    "23", "61", "42","23");
        this.addQuestion5(q4);
       Question q5=new Question("20 is divisible by ___ ","1","3","7","1");
        this.addQuestion5(q5);
        Question q6=new Question("What is the smallest three digit number ?"," 101","999" ,"100","100");

        this.addQuestion5(q6);
        Question q7=new Question("What is 1000 x 0 ?", "1", "0", "1000", "0");
        this.addQuestion5(q7);
        Question q8=new Question("Complete the sequence 13, 16, ___, 22 ","17","18","19","19");
        this.addQuestion5(q8);
        Question q9=new Question("123 + 34=",    "157","148","187" , "157");
        this.addQuestion5(q9);
        Question q10=new Question("247 / 13=","23","19","21","19");
        this.addQuestion5(q10);
        Question q11=new Question("12 * 0 + 12=","0", "12", "24", "12");
        this.addQuestion5(q11);
        Question q12=new Question("24 + 4 / 4", "25", "6", "28", "25");
        this.addQuestion5(q12);
        Question q13=new Question("Find the product of 72 × 3","216", "7230","106","216");
        this.addQuestion5(q13);
        Question q14=new Question("Subtract 457 from 832",    "57", "375", "970","375");
        this.addQuestion5(q14);
    }
    private void addQuestions6()
    {
        Question q1=new Question("Mary wanted 20 tickets.Her mom gave her some tickets.She need 6 more.How many did her mom give?","13", "14", "15", "14");
        this.addQuestion6(q1);
        Question q2=new Question("There were 30 guests and 5 apple pies. The pie was cut to give one slice to each. How many slices was each pie cut into?", "5", "6", "7", "6");
        this.addQuestion6(q2);
        Question q3=new Question("Helen baked 35 cookies yesterday and 13 cookies today. How many has she baked ?","48", "49","50","48");
        this.addQuestion6(q3);
        Question q4=new Question("Pinky bought 24 apples and 41 oranges. How many fruits does she have?",    "62", "64", "65","65");
        this.addQuestion6(q4);
        Question q5=new Question("Raj has 37 nails. How many nails does he need to buy if he needs 50 nails? ","12","13","17","13");
        this.addQuestion6(q5);
        Question q6=new Question("Ravi needs 70 gallons of paint. If he bought 23 gallons. How much more does he need?"," 53","47" ,"43","47");

        this.addQuestion6(q6);
        Question q7=new Question("If I have 16 books in each shelf and I have 5 shelves. How many books does he have?", "60", "70", "80", "80");
        this.addQuestion6(q7);
        Question q8=new Question("There are 23 apples in each row in the supermarket and there are 4 rows.How many apples are there? ","82","92","102","92");
        this.addQuestion6(q8);
        Question q9=new Question("Sit needs to distribute 48 cookies to 6 children. How many cookies does does each child get?",    "6","7","8" , "8");
        this.addQuestion6(q9);
        Question q10=new Question("247 / 13 =","23","19","21","19");
        this.addQuestion6(q10);

    }
    private void addQuestions7()
    {
        Question q1=new Question(" 158 = ___ + 106.What number will come in the blank to make the number sentence true??","52", "152", "158", "52");
        this.addQuestion7(q1);
        Question q2=new Question("Faizal has 918 marbles. he wants to make packets of marbles, with 9 marbles in each packet. how many packets will he be able to make?", "12","102","120","102");
        this.addQuestion7(q2);
        Question q3=new Question("Which of these  lies between 6.3 and 6.6? ","6.2","6.05","6.41","6.41");
        this.addQuestion7(q3);
        Question q4=new Question("A teacher brought some toffees to her class. after giving 3 toffees each to 15 students who had completed their assignments, she has 60 toffees left with her. how many toffees did she bring to the class?", "15","45","105","105");
        this.addQuestion7(q4);
        Question q5=new Question("John has stamps of different countries. 1/3rd of them are India stamps. if he has 36 Indian stamps, how many stamps does he have in total?","12","108","48","108");
        this.addQuestion7(q5);
        Question q6=new Question("Minu has bought 6 pens. the cost of each pen was between Rs.25 and Rs. 30. which of these could be the total cost of the pens?","Rs.55","Rs.126","Rs.174","Rs.174");

        this.addQuestion7(q6);
        Question q7=new Question("Which of the following is true?","20 + 0 = 0","0 * 20 = 0","20 - 0 = 0","0 * 20 = 0");
        this.addQuestion7(q7);
        Question q8=new Question("Ratio of 500ml to 2 litres is ","1:4","1:2","1:8","1:4");
        this.addQuestion7(q8);
        Question q9=new Question("The place value of 3 in 1.234","3","3/10","3/100","3/100");
        this.addQuestion7(q9);
        Question q10=new Question("106 × 106 – 94 × 94 = ?","2004","2400","1904","2400");
        this.addQuestion7(q10);
        Question q11=new Question("The simplest form of 1.5 : 2.5 is ____","6:10", "15:25", "3:5", "3:5");
        this.addQuestion7(q11);
        Question q12=new Question("Which of the following numbers gives 240 when added to its own square?", "15", "16", "18", "15");
        this.addQuestion7(q12);

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
// Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
        db.execSQL("DROP TABLE IF EXISTS " + SUBTRACTION);
        db.execSQL("DROP TABLE IF EXISTS " + MULTIPLICATION);
        db.execSQL("DROP TABLE IF EXISTS " + DIVISION);
        db.execSQL("DROP TABLE IF EXISTS " + EASY);
        db.execSQL("DROP TABLE IF EXISTS " + MEDIUM);
        db.execSQL("DROP TABLE IF EXISTS " + HARD);
// Create tables again
        onCreate(db);
    }
    // Adding new question
    public void addQuestion(Question quest) {
        //SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
// Inserting Row
        dbase.insert(TABLE_QUEST, null, values);
    }
    public void addQuestion7(Question quest) {
        //SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
// Inserting Row
        dbase.insert(HARD, null, values);
    }
    public void addQuestion6(Question quest) {
        //SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
// Inserting Row
        dbase.insert(MEDIUM, null, values);
    }
    public void addQuestion5(Question quest) {
        //SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
// Inserting Row
        dbase.insert(EASY, null, values);
    }
    public void addQuestionn(Question quest) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
// Inserting Row
        db.insert(TABLE_QUEST, null, values);
    }
    public void addQuestion2(Question quest) {
       // SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
// Inserting Row
        dbase.insert(SUBTRACTION, null, values);
    }
    public void addQuestionn2(Question quest) {
         SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
// Inserting Row
        db.insert(SUBTRACTION, null, values);
    }
    public void addQuestion3(Question quest) {
        //SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
// Inserting Row
        dbase.insert(MULTIPLICATION, null, values);
    }
    public void addQuestionn3(Question quest) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
// Inserting Row
        db.insert(MULTIPLICATION, null, values);
    }
    public void addQuestion4(Question quest) {
        //SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
// Inserting Row
        dbase.insert(DIVISION, null, values);
    }
    public void addQuestionn4(Question quest) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
// Inserting Row
        db.insert(DIVISION, null, values);
    }
    public List<Question> getAllQuestions() {
        List<Question> quesList = new ArrayList<Question>();
// Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        dbase=this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
// looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }
// return quest list
        return quesList;
    }
    public List<Question> getAllQuestions2() {
        List<Question> quesList = new ArrayList<Question>();
// Select All Query
        String selectQuery = "SELECT  * FROM " + SUBTRACTION;
        dbase=this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
// looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }
// return quest list
        return quesList;
    }
    public List<Question> getAllQuestions3() {
        List<Question> quesList = new ArrayList<Question>();
// Select All Query
        String selectQuery = "SELECT  * FROM " + MULTIPLICATION;
        dbase=this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
// looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }
// return quest list
        return quesList;
    }
    public List<Question> getAllQuestions4() {
        List<Question> quesList = new ArrayList<Question>();
// Select All Query
        String selectQuery = "SELECT  * FROM " + DIVISION;
        dbase=this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
// looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }
// return quest list
        return quesList;
    }
    public List<Question> getAllQuestions5() {
        List<Question> quesList = new ArrayList<Question>();
// Select All Query
        String selectQuery = "SELECT  * FROM " + EASY;
        dbase=this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
// looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }
// return quest list
        return quesList;
    }
    public List<Question> getAllQuestions6() {
        List<Question> quesList = new ArrayList<Question>();
// Select All Query
        String selectQuery = "SELECT  * FROM " + MEDIUM;
        dbase=this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
// looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }
// return quest list
        return quesList;
    }
    public List<Question> getAllQuestions7() {
        List<Question> quesList = new ArrayList<Question>();
// Select All Query
        String selectQuery = "SELECT  * FROM " + HARD;
        dbase=this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
// looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }
// return quest list
        return quesList;
    }
    public int rowcount()
    {
        int row=0;
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row=cursor.getCount();
        return row;
    }
    public int rowcount3()
    {
        int row=0;
        String selectQuery = "SELECT  * FROM " + MULTIPLICATION;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row=cursor.getCount();
        return row;
    }
    public int rowcount4()
    {
        int row=0;
        String selectQuery = "SELECT  * FROM " + DIVISION;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row=cursor.getCount();
        return row;
    }
    public int rowcount2()
    {
        int row=0;
        String selectQuery = "SELECT  * FROM " + SUBTRACTION;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row=cursor.getCount();
        return row;
    }
    public int rowcount7()
    {
        int row=0;
        String selectQuery = "SELECT  * FROM " + HARD;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row=cursor.getCount();
        return row;
    }
    public int rowcount6()
    {
        int row=0;
        String selectQuery = "SELECT  * FROM " + MEDIUM;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row=cursor.getCount();
        return row;
    }
    public int rowcount5()
    {
        int row=0;
        String selectQuery = "SELECT  * FROM " + EASY;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row=cursor.getCount();
        return row;
    }
}

