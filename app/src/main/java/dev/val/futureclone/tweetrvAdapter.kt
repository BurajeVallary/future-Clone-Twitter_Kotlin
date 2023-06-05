package dev.`val`.futureclone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.`val`.futureclone.databinding.TweetListItemBinding

class tweetrvAdapter(var tweetsList: List<TweetsData>):RecyclerView.Adapter<TweetsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsViewHolder {
        var binding =TweetListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TweetsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TweetsViewHolder, position: Int) {
        var currenttweet=tweetsList[position]
        holder.binding.apply {
            tvdisplayname.text=currenttweet.displayName
            tvhandle.text=currenttweet.handle
            tvtweet.text=currenttweet.tweet
            //the replycount is made tostring because the text expects a string for it to work
            tvlikecount.text=currenttweet.replyCount.toString()
            tvlikecount.text=currenttweet.likeCount.toString()
            tvretweet.text=currenttweet.rtCount.toString()
        }
    }

    override fun getItemCount(): Int {
        return tweetsList.size
    }
}


class TweetsViewHolder(var binding: TweetListItemBinding):RecyclerView.ViewHolder(binding.root){

}