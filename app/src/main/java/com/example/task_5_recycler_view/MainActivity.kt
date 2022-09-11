package com.example.task_5_recycler_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import java.text.FieldPosition

public lateinit var lists:List<Fruit>
class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    recyclerView=findViewById(R.id.main_recycler_view)
        val listOfFruits=getListOfFruits()
        lists=listOfFruits
        val fruitsAdapter=FruitsAdapter(listOfFruits)
        recyclerView.adapter=fruitsAdapter

    }
public fun getListOfFruits():List<Fruit>
{
    val fruits= mutableListOf<Fruit>()
    fruits.add(Fruit("Apple",R.drawable.apple,"Apples are an incredibly nutritious fruit that offers multiple health benefits. They're rich in fiber and antioxidants. Eating them is linked to a lower risk of many chronic conditions, including diabetes, heart disease, and cancer. Apples may also promote weight loss and improve gut and brain health."))
    fruits.add(Fruit("Avocado",R.drawable.avocado,"Avocados are a source of vitamins C, E, K, and B6, as well as riboflavin, niacin, folate, pantothenic acid, magnesium, and potassium. They also provide lutein, beta carotene, and omega-3 fatty acids. Avocados contain high levels of healthy, beneficial fats, which can help a person feel fuller between meals."))
    fruits.add(Fruit("banana",R.drawable.banana,"Bananas are a tasty and convenient source of some important nutrients. People have grown this tropical fruit since ancient times, and its health benefits have been promoted for more than a century.  "))
    fruits.add(Fruit("Cherry",R.drawable.cherry,"Cherries are low in calories and chock full of fiber, vitamins, minerals, nutrients, and other good-for-you ingredients. You'll get vitamins C, A, and K. Each long-stemmed fruit delivers potassium, magnesium, and calcium too. They also bring antioxidants, like beta-carotene, and the essential nutrient choline."))
    fruits.add(Fruit("Fig",R.drawable.fig,"They are an excellent source of prebiotics, which improve overall gut health. Figs are a good source of both calcium and potassium. These minerals can work together to improve bone density, which can, in turn, prevent conditions like osteoporosis."))
    fruits.add(Fruit("Red Grapes",R.drawable.grapes,"Grapes are a go-to snack for picnics and lunchboxes, but don't take them for granted. For thousands of years, they've been used in some cultures as medicine. Each of these small fruits is loaded with over 1,600 compounds -- and many of them can help keep you healthy."))
    fruits.add(Fruit("Green Grapes",R.drawable.grapes_2,"Grapes are a go-to snack for picnics and lunchboxes, but don't take them for granted. For thousands of years, they've been used in some cultures as medicine. Each of these small fruits is loaded with over 1,600 compounds -- and many of them can help keep you healthy."))
    fruits.add(Fruit("Kiwi",R.drawable.kiwi,"Kiwis are high in Vitamin C and dietary fiber and provide a variety of health benefits. This tart fruit can support heart health, digestive health, and immunity. The kiwi is a healthy choice of fruit and is rich with vitamins and antioxidants."))
    fruits.add(Fruit("Mango",R.drawable.mango,"They are a great source of magnesium and potassium, both of which are connected to lower blood pressure and a regular pulse. Furthermore, mangos are the source of a compound known as mangiferin, which early studies suggest may be able to reduce inflammation of the heart. Mangos can help stabilize your digestive system."))
    fruits.add(Fruit("Orange",R.drawable.orange,"What are the benefits of eating an orange?\n" +
            "In addition to vitamin C, oranges have other nutrients that keep your body healthy. The fiber in oranges can keep blood sugar levels in check and reduce high cholesterol to prevent cardiovascular disease. Oranges contain approximately 55 milligrams of calcium, or 6% of your daily requirement."))
    fruits.add(Fruit("Peach",R.drawable.peach,"Peaches Promote Healing\n" +
            "1/11\n" +
            "Don’t be fooled by a peach’s small size and delicate skin. Just one medium peach has about 11% of the vitamin C you need each day. This nutrient helps your body heal wounds and keeps your immune system going strong. It also helps get rid of “free radicals” -- chemicals that have been linked to cancer because they can damage your cells."))
    fruits.add(Fruit("Pineapple",R.drawable.pineapple,"Eating a few slices of fresh pineapple a day can defend your body from harmful free radicals and disease, help your digestion by cleaning the body's organs and blood, increase your energy intake and boost metabolism, nourish your hair, skin, nails and teeth and keep you generally healthy – plus it tastes great!"))
    fruits.add(Fruit("Raspberry",R.drawable.raspberry,"They provide potassium, essential to heart function, and proven to lower blood pressure. The omega-3 fatty acids in raspberries can help prevent stroke and heart disease. They also contain a mineral called manganese, which is necessary for healthy bones and skin and helps regulate blood sugar."))
    fruits.add(Fruit("Strawberry",R.drawable.strawberry,"These potent little packages protect your heart, increase HDL (good) cholesterol, lower your blood pressure, and guard against cancer. Packed with vitamins, fiber, and particularly high levels of antioxidants known as polyphenols, strawberries are a sodium-free, fat-free, cholesterol-free, low-calorie food."))
//    fruits.add(Fruit("Tangerine",R.drawable.tangerine,null))
    fruits.add(Fruit("Watermelon",R.drawable.watermelon,"Loaded With Lycopene\n" +
            "1/15\n" +
            "The cheery red color comes from lycopene, an antioxidant. Studies show it may help curb your risk of cancer and diabetes as part of a healthy lifestyle. Watermelon has more of this nutrient than any other fruit or veggie -- even tomatoes. To load up on lycopene, choose a melon with bright red flesh rather than yellow or orange. And the riper, the better. Also, seedless melon tends to have more lycopene than those with seeds."))
    fruits.add(Fruit("Apple 2",R.drawable.apple_2,"Apples are an incredibly nutritious fruit that offers multiple health benefits. They're rich in fiber and antioxidants. Eating them is linked to a lower risk of many chronic conditions, including diabetes, heart disease, and cancer. Apples may also promote weight loss and improve gut and brain health."))
    fruits.add(Fruit("Orange 2",R.drawable.orange_2,"What are the benefits of eating an orange?\n" +
            "In addition to vitamin C, oranges have other nutrients that keep your body healthy. The fiber in oranges can keep blood sugar levels in check and reduce high cholesterol to prevent cardiovascular disease. Oranges contain approximately 55 milligrams of calcium, or 6% of your daily requirement."))
    fruits.add(Fruit("Pineapple 2",R.drawable.pineapple_2,"Eating a few slices of fresh pineapple a day can defend your body from harmful free radicals and disease, help your digestion by cleaning the body's organs and blood, increase your energy intake and boost metabolism, nourish your hair, skin, nails and teeth and keep you generally healthy – plus it tastes great!"))
    fruits.add(Fruit("Strawberry",R.drawable.strawberry_2,"These potent little packages protect your heart, increase HDL (good) cholesterol, lower your blood pressure, and guard against cancer. Packed with vitamins, fiber, and particularly high levels of antioxidants known as polyphenols, strawberries are a sodium-free, fat-free, cholesterol-free, low-calorie food."))
    fruits.add(Fruit("Watermelon",R.drawable.watermelon_2,"Loaded With Lycopene\\n\" +\n" +
            "            \"1/15\\n\" +\n" +
            "            \"The cheery red color comes from lycopene, an antioxidant. Studies show it may help curb your risk of cancer and diabetes as part of a healthy lifestyle. Watermelon has more of this nutrient than any other fruit or veggie -- even tomatoes. To load up on lycopene, choose a melon with bright red flesh rather than yellow or orange. And the riper, the better. Also, seedless melon tends to have more lycopene than those with seeds."))
    return fruits
}

}