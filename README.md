#Important Annotations

- @Entity : The class name gets Set as the table name in DB
- @Table(name = "MyName") - Customized name. If not given the table name will be the name of the class

- Renaming Annotations
...- @Column(name="User_Id") - resets the name of the column to User_Id in the Database
  
- @Embeddable - the class that is needeed (sub)
- @Embedded - the class where enbaddable is to be used


> The overriding design goal for Markdown's
> formatting syntax is to make it as readable
> as possible. The idea is that a
> Markdown-formatted document should be
> publishable as-is, as plain text, without
> looking like it's been marked up with tags
> or formatting instructions.

### Annotations examples


```java
	@Id
	@Column(name="User_Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int uId;
	@Column(name="User_Name")
	private String uName;
	
	@Column(nullable=false)
```

```sh
$ git clone [git-repo-url] dillinger
```

### Refer here for maintaining the .md file
[Markdown Cheatsheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet "Cheat Sheet")
