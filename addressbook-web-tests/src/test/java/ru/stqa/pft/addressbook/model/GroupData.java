package ru.stqa.pft.addressbook.model;

import com.google.gson.annotations.Expose;

import java.util.Objects;

public class GroupData {

  private int id = Integer.MAX_VALUE;
  public int getId() { return id; }
  public GroupData setId(int id) {
    this.id = id;
    return this;
  }

  @Expose
  private String group_name;
  public String getGroupName() {
    return group_name;
  }
  public GroupData setName(String group_name) {
    this.group_name = group_name;
    return this;
  }

  @Expose
  private String header;
  public String getHeader() {
    return header;
  }
  public GroupData setHeader(String header) {
    this.header = header;
    return this;
  }

  @Expose
  private String footer;
  public String getFooter() {
    return footer;
  }
  public GroupData setFooter(String footer) {
    this.footer = footer;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GroupData groupData = (GroupData) o;
    return id == groupData.id && Objects.equals(group_name, groupData.group_name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, group_name);
  }

  @Override
  public String toString() {
    return "GroupData{" +
            "id=" + id +
            ", group_name='" + group_name + '\'' +
            '}';
  }

}
