package com.example.myapp2.models;

import javax.persistence.*;

@Entity
@Table(name="playlist_listeners")
public class PlaylistListener {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name="id")
  private Integer id;
  private String username;
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
//  public PlaylistListener() {    }
//  public PlaylistListener(Integer id, String username) {
//    this.id = id;
//    this.username = username;
//  }
//  public String toString() {
//    return id + ", " + username;
//  }
}
