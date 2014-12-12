package edu.uchicago.mpcs53013.kafkaStreamingPosts;

import java.util.Date;
import java.io.Serializable;
import com.google.common.base.Objects;

import edu.uchicago.mpcs53013.PostSummary.PostSummary;


public class CassandraPostSummary implements Serializable {
	private String reddit_id;
	private int image_id;
	private String title;
	private String subreddit;
	private int comments;
	private String username;
	private int unixtime;
	private String rawtime;
	private int localtime;	
	private int score;	
	private int total_votes;
	private int upvotes;
	private int downvotes;
	
	public CassandraPostSummary(){}
	
	CassandraPostSummary(PostSummary postSummary) {
		this.reddit_id = postSummary.reddit_id;
		this.image_id = postSummary.image_id;
		this.title = postSummary.title;
		this.subreddit = postSummary.subreddit;
		this.comments = postSummary.comments;
		this.username = postSummary.username;
		this.unixtime = postSummary.unixtime;
		this.rawtime = postSummary.rawtime;
		this.localtime = postSummary.localtime;
		this.score = postSummary.score;
		this.total_votes = postSummary.total_votes;
		this.upvotes = postSummary.upvotes;
		this.downvotes = postSummary.downvotes;
	}

	public String getReddit_id() {
		return reddit_id;
	}

	public void setReddit_id(String reddit_id) {
		this.reddit_id = reddit_id;
	}

	public int getImage_id() {
		return image_id;
	}

	public void setImage_id(int image_id) {
		this.image_id = image_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubreddit() {
		return subreddit;
	}

	public void setSubreddit(String subreddit) {
		this.subreddit = subreddit;
	}

	public int getComments() {
		return comments;
	}

	public void setComments(int comments) {
		this.comments = comments;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getUnixtime() {
		return unixtime;
	}

	public void setUnixtime(int unixtime) {
		this.unixtime = unixtime;
	}

	public String getRawtime() {
		return rawtime;
	}

	public void setRawtime(String rawtime) {
		this.rawtime = rawtime;
	}

	public int getLocaltime() {
		return localtime;
	}

	public void setLocaltime(int localtime) {
		this.localtime = localtime;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getTotal_votes() {
		return total_votes;
	}

	public void setTotal_votes(int total_votes) {
		this.total_votes = total_votes;
	}

	public int getUpvotes() {
		return upvotes;
	}

	public void setUpvotes(int upvotes) {
		this.upvotes = upvotes;
	}

	public int getDownvotes() {
		return downvotes;
	}

	public void setDownvotes(int downvotes) {
		this.downvotes = downvotes;
	}

	@Override
	public String toString() {
		return "CassandraPostSummary [reddit_id=" + reddit_id + ", image_id="
				+ image_id + ", title=" + title + ", subreddit=" + subreddit
				+ ", comments=" + comments + ", username="
				+ username + ", unixtime=" + unixtime + ", rawtime=" + rawtime
				+ ", localtime=" + localtime + ", score=" + score
				+ ", total_votes=" + total_votes + ", upvotes=" + upvotes
				+ ", downvotes=" + downvotes + "]";
	}


}