#Interesting Observation

Important Annotationa

  - @Entity : Sets the table name in DB
  - Renaming Annotations
  	- @Column(name="User_Id") - resets the name of the column to User_Id in the Database
  

> The overriding design goal for Markdown's
> formatting syntax is to make it as readable
> as possible. The idea is that a
> Markdown-formatted document should be
> publishable as-is, as plain text, without
> looking like it's been marked up with tags
> or formatting instructions.

### Version
3.2.0
### Installation

You need Gulp installed globally:

```java
	@Id
	@Column(name="User_Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int uId;
	@Column(name="User_Name")
	private String uName;
```

```sh
$ git clone [git-repo-url] dillinger
$ cd dillinger
$ npm i -d
$ mkdir -p downloads/files/{md,html,pdf}
$ gulp build --prod
$ NODE_ENV=production node app
```

First Tab:
```sh
$ node app
```

Second Tab:
```sh
$ gulp watch
```
