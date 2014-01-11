insert into users values (1, "Sasaki Nobuya", "sasaki@sample.com", "625f39d032201ef654fc8324685428bb");
insert into users values (2, "Sasaki", "sasaki@email.com", "725f39d032201ef654fc8324685428bb");
insert into shops values (1, 1, "00-5000-5000", "Sample Shop", 35.66222222, 139.70055555);
insert into categories values (1, "pants");
insert into products values (1, 1, 1, 1, "/SampleShop/1", "*************", 5000, "SampleBrand", 1);
insert into products values (2, 1, 1, 1, "/SampleShop/2", "*************", 5000, "SampleBrand", 1);
insert into favorites values (1, 1, 1);

desc categories;
desc favorites;
desc products;
desc shops;
desc users;

select * from categories;
select * from favorites;
select * from products;
select * from shops;
select * from users;
