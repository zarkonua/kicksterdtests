package com.kicksterd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class Home extends Page {

    private static final String URl = "https://twitter.com/";

    public void open() {
        open(URl);
    }

    public void GetStatusByName() {
        $(By.xpath("*//div[contains(text(),'Twitter test message TweetsTests')]")).click();
    }
}//div[contains(text(),'noreply@somedomain.com')]
//*[@id="stream-item-tweet-908612584676429824"]/div[1]

<div class="tweet js-stream-tweet js-actionable-tweet js-profile-popup-actionable dismissible-content
        original-tweet js-original-tweet

        my-tweet
        " data-tweet-id="908612584676429824" data-item-id="908612584676429824" data-permalink-path="/ZaRk8n/status/908612584676429824" data-conversation-id="908612584676429824" data-tweet-nonce="908612584676429824-89d8552a-e74f-4bff-bb64-47a6c612f362" data-tweet-stat-initialized="true" data-screen-name="ZaRk8n" data-name="Aleksandr Furman" data-user-id="460457247" data-you-follow="false" data-follows-you="false" data-you-block="false" data-reply-to-users-json="[{&quot;id_str&quot;:&quot;460457247&quot;,&quot;screen_name&quot;:&quot;ZaRk8n&quot;,&quot;name&quot;:&quot;Aleksandr Furman&quot;,&quot;emojified_name&quot;:{&quot;text&quot;:&quot;Aleksandr Furman&quot;,&quot;emojified_text_as_html&quot;:&quot;Aleksandr Furman&quot;}}]" data-disclosure-type="" data-supports-landscape-presentation="true" data-tfb-view="/i/tfb/v1/quick_promote/908612584676429824">

<div class="context">


</div>

<div class="content">





<div class="stream-item-header">
<a class="account-group js-account-group js-action-profile js-user-profile-link js-nav" href="/ZaRk8n" data-user-id="460457247">
<img class="avatar js-action-profile-avatar" src="https://pbs.twimg.com/profile_images/1746414179/image3xxl_bigger.jpg" alt="">
<span class="FullNameGroup">
<strong class="fullname show-popup-with-id " data-aria-label-part="">Aleksandr Furman</strong><span>‏</span><span class="UserBadges"></span><span class="UserNameBreak">&nbsp;</span></span><span class="username u-dir" dir="ltr" data-aria-label-part="">@<b>ZaRk8n</b></span></a>


<small class="time">
<a href="/ZaRk8n/status/908612584676429824" class="tweet-timestamp js-permalink js-nav js-tooltip" data-conversation-id="908612584676429824" data-original-title="11:44 AM - 15 Sep 2017"><span class="_timestamp js-short-timestamp js-relative-timestamp" data-time="1505465096" data-time-ms="1505465096000" data-long-form="true" aria-hidden="true">4h</span><span class="u-hiddenVisually" data-aria-label-part="last">4 hours ago</span></a>
</small>

<div class="ProfileTweet-action ProfileTweet-action--more js-more-ProfileTweet-actions">
<div class="dropdown">
<button class="ProfileTweet-actionButton u-textUserColorHover dropdown-toggle js-dropdown-toggle" type="button" aria-haspopup="true">
<div class="IconContainer js-tooltip" title="More">
<span class="Icon Icon--caretDownLight Icon--small"></span>
<span class="u-hiddenVisually">More</span>
</div>
</button>
<div class="dropdown-menu is-autoCentered">
<div class="dropdown-caret">
<div class="caret-outer"></div>
<div class="caret-inner"></div>
</div>
<ul>
<li class="share-via-dm js-actionShareViaDM" data-nav="share_tweet_dm">
<button type="button" class="dropdown-link">Share via Direct Message</button>
</li>

<li class="copy-link-to-tweet js-actionCopyLinkToTweet">
<button type="button" class="dropdown-link">Copy link to Tweet</button>
</li>
<li class="embed-link js-actionEmbedTweet" data-nav="embed_tweet">
<button type="button" class="dropdown-link">Embed Tweet</button>
</li>
<li class="user-pin-tweet js-actionPinTweet" data-nav="user_pin_tweet">
<button type="button" class="dropdown-link">Pin to your profile page</button>
</li>
<li class="user-unpin-tweet js-actionPinTweet" data-nav="user_unpin_tweet">
<button type="button" class="dropdown-link">Unpin from profile page</button>
</li>
<li class="js-actionDelete">
<button type="button" class="dropdown-link">Delete Tweet</button>
</li>
<li class="dropdown-divider"></li>
<li class="js-actionMomentMakerAddTweetToOtherMoment MomentMakerAddTweetToOtherMoment" style="display: none;">
<button type="button" class="dropdown-link">Add to other Moment</button>
</li>
<li class="js-actionMomentMakerCreateMoment">
<button type="button" class="dropdown-link">Add to new Moment</button>
</li>
</ul>
</div>
</div>

</div>

</div>





<div class="js-tweet-text-container">
<p class="TweetTextSize  js-tweet-text tweet-text" lang="en" data-aria-label-part="0">Twitter test message TweetsTests</p>
</div>












<div class="stream-item-footer">

<div class="ProfileTweet-actionCountList u-hiddenVisually">


<span class="ProfileTweet-action--reply u-hiddenVisually">
<span class="ProfileTweet-actionCount" aria-hidden="true" data-tweet-stat-count="0">
<span class="ProfileTweet-actionCountForAria" id="profile-tweet-action-reply-count-aria-908612584676429824">0 replies</span>
</span>
</span>
<span class="ProfileTweet-action--retweet u-hiddenVisually">
<span class="ProfileTweet-actionCount" aria-hidden="true" data-tweet-stat-count="0">
<span class="ProfileTweet-actionCountForAria" id="profile-tweet-action-retweet-count-aria-908612584676429824">0 retweets</span>
</span>
</span>
<span class="ProfileTweet-action--favorite u-hiddenVisually">
<span class="ProfileTweet-actionCount" aria-hidden="true" data-tweet-stat-count="0">
<span class="ProfileTweet-actionCountForAria" id="profile-tweet-action-favorite-count-aria-908612584676429824">0 likes</span>
</span>
</span>
</div>

<div class="ProfileTweet-actionList js-actions" role="group" aria-label="Tweet actions">
<div class="ProfileTweet-action ProfileTweet-action--reply">
<button class="ProfileTweet-actionButton js-actionButton js-actionReply" data-modal="ProfileTweet-reply" type="button" aria-describedby="profile-tweet-action-reply-count-aria-908612584676429824">
<div class="IconContainer js-tooltip" title="Reply">
<span class="Icon Icon--medium Icon--reply"></span>
<span class="u-hiddenVisually">Reply</span>
</div>
<span class="ProfileTweet-actionCount ProfileTweet-actionCount--isZero ">
<span class="ProfileTweet-actionCountForPresentation" aria-hidden="true"></span>
</span>
</button>
</div>

<div class="ProfileTweet-action ProfileTweet-action--retweet js-toggleState js-toggleRt">
<button class="ProfileTweet-actionButton  js-actionButton js-actionRetweet" data-modal="ProfileTweet-retweet" type="button" aria-describedby="profile-tweet-action-retweet-count-aria-908612584676429824">
<div class="IconContainer js-tooltip" data-original-title="Retweet">
<span class="Icon Icon--medium Icon--retweet"></span>
<span class="u-hiddenVisually">Retweet</span>
</div>
<span class="ProfileTweet-actionCount ProfileTweet-actionCount--isZero">
<span class="ProfileTweet-actionCountForPresentation" aria-hidden="true"></span>
</span>

</button><button class="ProfileTweet-actionButtonUndo js-actionButton js-actionRetweet" data-modal="ProfileTweet-retweet" type="button">
<div class="IconContainer js-tooltip" title="Undo retweet">
<span class="Icon Icon--medium Icon--retweet"></span>
<span class="u-hiddenVisually">Retweeted</span>
</div>
<span class="ProfileTweet-actionCount ProfileTweet-actionCount--isZero">
<span class="ProfileTweet-actionCountForPresentation" aria-hidden="true"></span>
</span>

</button>
</div>


<div class="ProfileTweet-action ProfileTweet-action--favorite js-toggleState">
<button class="ProfileTweet-actionButton js-actionButton js-actionFavorite" type="button" aria-describedby="profile-tweet-action-favorite-count-aria-908612584676429824">
<div class="IconContainer js-tooltip" title="Like">
<span role="presentation" class="Icon Icon--heart Icon--medium"></span>
<div class="HeartAnimation"></div>
<span class="u-hiddenVisually">Like</span>
</div>
<span class="ProfileTweet-actionCount ProfileTweet-actionCount--isZero">
<span class="ProfileTweet-actionCountForPresentation" aria-hidden="true"></span>
</span>

</button><button class="ProfileTweet-actionButtonUndo ProfileTweet-action--unfavorite u-linkClean js-actionButton js-actionFavorite" type="button">
<div class="IconContainer js-tooltip" title="Undo like">
<span role="presentation" class="Icon Icon--heart Icon--medium"></span>
<div class="HeartAnimation"></div>
<span class="u-hiddenVisually">Liked</span>
</div>
<span class="ProfileTweet-actionCount ProfileTweet-actionCount--isZero">
<span class="ProfileTweet-actionCountForPresentation" aria-hidden="true"></span>
</span>

</button>
</div>





<div class="ProfileTweet-action ProfileTweet-action--analytics">
<button class="ProfileTweet-actionButton u-textUserColorHover js-actionButton js-actionQuickPromote" type="button">
<div class="IconContainer js-tooltip" title="View Tweet activity">
<span class="Icon Icon--medium Icon--analytics"></span>
<span class="u-hiddenVisually">View Tweet activity</span>
</div>
</button>
</div>

</div>

</div>







</div>
</div>