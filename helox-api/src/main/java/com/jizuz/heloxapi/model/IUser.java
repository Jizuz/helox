package com.jizuz.heloxapi.model;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "iUser", type = "docs", shards = 1, replicas = 0)
public class IUser {

    @Field(type = FieldType.Text)
    public String name;

    @Field(type = FieldType.Integer)
    public int age;

}
