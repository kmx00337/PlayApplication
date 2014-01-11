# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table categories (
  category_id               bigint auto_increment not null,
  category                  varchar(255),
  constraint pk_categories primary key (category_id))
;

create table favorites (
  favorite_id               bigint auto_increment not null,
  user_id                   bigint,
  product_id                bigint,
  constraint pk_favorites primary key (favorite_id))
;

create table products (
  product_id                bigint auto_increment not null,
  category_id               bigint,
  shop_id                   bigint,
  user_id                   bigint,
  image_path                varchar(255),
  promo_word                varchar(255),
  price                     bigint,
  brand                     varchar(255),
  stock                     bigint,
  constraint pk_products primary key (product_id))
;

create table sample (
  id                        bigint auto_increment not null,
  sample                    varchar(255),
  constraint pk_sample primary key (id))
;

create table shops (
  shop_id                   bigint auto_increment not null,
  user_id                   bigint,
  tel_number                varchar(255),
  shop_name                 varchar(255),
  latitude                  double,
  longitude                 double,
  constraint pk_shops primary key (shop_id))
;

create table users (
  user_id                   bigint auto_increment not null,
  user_name                 varchar(255),
  email                     varchar(255),
  password                  varchar(255),
  constraint pk_users primary key (user_id))
;

alter table products add constraint fk_products_categories_1 foreign key (category_id) references categories (category_id) on delete restrict on update restrict;
create index ix_products_categories_1 on products (category_id);
alter table products add constraint fk_products_shops_2 foreign key (shop_id) references shops (shop_id) on delete restrict on update restrict;
create index ix_products_shops_2 on products (shop_id);
alter table products add constraint fk_products_users_3 foreign key (user_id) references users (user_id) on delete restrict on update restrict;
create index ix_products_users_3 on products (user_id);
alter table shops add constraint fk_shops_users_4 foreign key (user_id) references users (user_id) on delete restrict on update restrict;
create index ix_shops_users_4 on shops (user_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table categories;

drop table favorites;

drop table products;

drop table sample;

drop table shops;

drop table users;

SET FOREIGN_KEY_CHECKS=1;

