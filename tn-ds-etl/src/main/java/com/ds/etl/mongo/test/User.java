package com.ds.etl.mongo.test;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.TextScore;


@Document(collection="user")
@CompoundIndexes({
	@CompoundIndex(name="name_cid_index", def="{name:1, cid:-1}")
})
public class User<T> {
	@Id
    private String id;
   
	private String name;
    private String cid;
    
    @Indexed(unique=false)
    private String password;
    @Transient
    private String nickname;
    @GeoSpatialIndexed
    private String geo;
    
    @TextIndexed(weight=2)
    private String title;
    @TextIndexed String content;
    @TextScore
    private Float score;
    private T data;
    private Date createTime;
    
    
    
    public User() {
		super();
	}
	public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getGeo() {
		return geo;
	}

	public void setGeo(String geo) {
		this.geo = geo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Float getScore() {
		return score;
	}

	public void setScore(Float score) {
		this.score = score;
	}
	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", cid=" + cid
				+ ", password=" + password + ", nickname=" + nickname
				+ ", geo=" + geo + ", title=" + title + ", content=" + content
				+ ", score=" + score + ", data=" + data + ", createTime="
				+ createTime + "]";
	}
}
