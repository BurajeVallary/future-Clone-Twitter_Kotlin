package dev.`val`.futureclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.`val`.futureclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView((binding.root))
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        displayTweets()
    }

    fun displayTweets(){
        var tweet1=TweetsData("Valary","Buraje Vallary","@vallaryburaje","I am always adamant to speak of how highly I hold my genuine friends",
            4,6,200)
        var tweet2=TweetsData("Mary","Jane Mary","@maryjane","Yoh I love these people all heartedly and one thing about me is that I know my people",
            17,50,90)

        var tweet3=TweetsData("Lavin","Kageha Lavin","@kagehalavin","I can pick my grain from the chaff and I am always down for whoever is down for me",
            4,56,300)
        var tweet4=TweetsData("Mike"," Mike Oketch","@mikejames","Yet  another day of burning the midnight oil",
            25,95,360)

        var tweet5=TweetsData("Arriana","Grande Arriana","@arrygranny","It is called digging for wins and merchandise in places considered to be farfetched ",
            14,56,290)
        var tweet6=TweetsData("jacky","Vike Jacky","@jackyvike","My life is an embodiment of the mantra that a win-win is my bargain..Less loses and more wins as I believe in",
            100,15,380)

        var tweet7=TweetsData("Mercy","Masian Mercy","@masianmercy","I bet that's why embracing defeats and loses has been the hardest tussles for me ",
            4,56,300)
        var tweet8=TweetsData("Parkire","Jane Parkire","@janyparkire","My waves and zeal ain't stopping until I meet my illusions ",
            1,5,1130)

        var tweet9=TweetsData("Jayden","Dalvin Khalechi","@jaydenDalvin","In my diary ,success and elevation cosigned long ago and prolly the only thing remaining is to strike a risky move",
            90,50,110)

        var tweet10=TweetsData("Buraje","Vallary Dalvin","@vallryburaje","Not to risk but to,'dare to live my dreams-I know I am the future...The future lies here by Vallary Buraje",
            1,5,1130)

        var tweetList= listOf<TweetsData>(tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7,tweet8,tweet9)
        binding.Rvcontacts.layoutManager=LinearLayoutManager(this)
        var tweetsAdapter=tweetrvAdapter(tweetList)
        binding.Rvcontacts.adapter=tweetsAdapter
    }
}
