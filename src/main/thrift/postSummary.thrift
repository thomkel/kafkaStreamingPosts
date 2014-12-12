namespace java edu.uchicago.mpcs53013.PostSummary

struct PostSummary {
	1: required string reddit_id;
	2: required i32 image_id;
	3: required string title;
	4: required string subreddit;
	5: required i32 comments;
	6: required string username;
	7: required i32 unixtime;
	8: required string rawtime;
	9: required i32 localtime;	
	10: required i32 score;
	11: required i32 total_votes;
	12: required i32 upvotes;
	13: required i32 downvotes;
}