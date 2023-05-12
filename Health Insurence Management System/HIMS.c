/*ZeeMedlife Insurence Company Health Insurence Management System*/
/*NPI000088_Arun_Saru_first_sem_BSc.IT*/
#include <stdio.h>
#include <conio.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>

//structure area
//userdb
struct userdb{
	int id, age, day, month, year, min, hrs, transId, hid;
	float balance, claim;
	char name[25], surname[25], address[50], contact[15], uname[100], passwd[100], nationality[20], citizenship[20], email[100], claimlimit[10], plantype[9], gender[7]; 
	char asthama[7], chickenPox[7], anemia[7], ADHD[7], diabeties[7], constipation[7], glasses[7], heart[7], hepatits[7], pneumonia[7], urinary[7], thyroid[7], hbp[7], lbp[7];
};


//function prototypes

void header(); //header display

//USER
int userId();
void user();  //user page
void signUp(); //signing up by user
void logIn(); //login with their credintials
void menu(); //menu of user
void claim(int);//claim the insurence

void historyR(int);
void history(int);
void healthHistory(int);
void healthS();

void plan(int); //only to display plan
void ageEligAnnual(int);// for annual claim limit
void ageEligLifetime(int);//for lifetime claim limit
void plantypeYearly();//planchoose in yearly plan type like 120/150/200
void plantypeLifetime();
void planSelect(int); // to select ap,lp plans !!!!!HALT
void newsubs(int);

//database
void planSub(int);
void profile(int);

//ADMIN
void auth();   //authentication in admin
void admin(); //admin functionalities
void search();
void ulist();
void manage(); // to manage users
int year();//time
int month();
int dd();
int transactionId();
int hrs();
int min();
void Info();
void BalanceRun();
void transaction();
void Ainfo();
void Linfo();
void About();

//main area
void main()
{
	int choice;
	struct userdb db;
	do{		
		header();	
		printf("\n1. Admin \t2. User \t3. About \t4. Exit");
		printf("\n\nselect option : ");
		scanf("%d",&choice); fflush(stdin);
		switch(choice){
			case 1: auth();
				break;
			case 2: user();
				break;
			case 3: About();
				break;
			case 4: printf("Thanks for using this application :) "); getch();
				return;
			default: printf("invalid input!!"); getch();
				break;	
		}
	}while(1);
}//main area end


//function declaration area start

//header
void header(){
	system("cls");
	printf("\n\t\t\t\t   ZeeMediLife Insurance Company\n\n");
	printf("\t\t\t\tHEALTH INSURENCE MANAGEMENT SYSTEM\n\n");
}

//time
int year()
{	
	int a;
	time_t l = time(NULL);
  	struct tm t = *localtime(&l);
  	a = t.tm_year + 1900;
  	return a;
}
int month()
{	
	int a;
	time_t l = time(NULL);
  	struct tm t = *localtime(&l);
  	a = t.tm_mon + 1;
  	return a;
}
int dd()
{	
	int a;
	time_t l = time(NULL);
  	struct tm t = *localtime(&l);
  	a = t.tm_mday;
  	return a;
}
int hrs(){
	int a;
	time_t l = time(NULL);
  	struct tm t = *localtime(&l);
  	a = t.tm_hour;
  	return a;
}
int min(){
	int a;
	time_t l = time(NULL);
  	struct tm t = *localtime(&l);
  	a = t.tm_min;
  	return a;
}

//For ADMIN AREA START


//authentication
void auth(){
	char uname[20] = "admin" , pswd[20]="admin123" , unamep[20] , pswdp[20], yn;
	
	do{
		system("cls");
		printf("\n\t\t   ZeeMediLife Insurance Company\n\n");
		printf("\t\t\t  (Sign In)\n");
		
		printf("\nUsername : "); scanf("%s",&unamep); fflush(stdin);
		printf("\nPassword : "); gets(pswdp); fflush(stdin);
		
		if(strcmp(uname,unamep) == 0){
			if(strcmp(pswd,pswdp) == 0){
				printf(" \nLogin successful :) "); getch();
				admin();
				return ;
			}
			else{
				printf(" Login failed password didn't match :( "); getch();
				break;
			}
		}
		else
		{
			printf(" Login failed invalid username :( "); getch();
			break;
		}
	}while(1);
	printf("\n Do you want to continue?[y-Yes | n-No]\n");
		scanf("%c",&yn); fflush(stdin);
		if(yn == 'y'){
			auth();
			return;
		}else{
			return;
		}				
	getch();		
}//end of auth



//admin
void admin(){
	system("cls");
	
	do{
		header();
		int choice;
		printf("\n\t\t\t\t\t( ADMIN DASHBOARD )\n\n");

		printf("\n1. Users\t\t2. Search\t\t3. Health History\t4. Info\t\t5. GoBack");	
		printf("\n\nSelected Option : ");
		scanf("%d",&choice); fflush(stdin);
		switch(choice){
			case 1: ulist();
				break;
			case 2: search();
				break;
			case 3: healthS();
				break;
			case 4:Info();
			break;
			case 5: 
				return;
			default :  printf("invalid input!!! try again!!!");
				break;
		}
	}while(1);
		
}//end of admin

//User List
void ulist(){
	header();
	FILE *f;
	struct userdb db;
	f = fopen("user.txt","rb");
	if(f == NULL){
		printf("\n\ncan't open this file"); getch();
		return;
	}
	printf("\nUSER INFORMATION\n....*...........\n\n");	
	printf("\nID\tNAME\t\tsurname\t\tAGE\tADDRESS\t\tCONTACT\t\tUSERNAME\tPASSWORD\n..\t....\t\t.......\t\t...\t.......\t\t.......\t\t........\t........\n");
			
	while(fread(&db,sizeof(db),1,f) == 1){	
		printf("%d\t%s\t\t%s\t\t%d\t%s\t\t%s\t%s\t\t%s\n", db.id, db.name, db.surname, db.age, db.address, db.contact,db.uname,db.passwd);
	
	}
	fclose(f);
	getch();		
}


//search feature
void search(){
	int id;
	struct userdb db;
	char yn;
	FILE *f;
	f = fopen("user.txt","rb");
//	do{
		header();	
		if(f == NULL){
			printf("\n\ncan't open this file"); getch();
			return;
		}
		printf("Enter ID: ",id); scanf("%d",&id); fflush(stdin);
		while(fread(&db,sizeof(db),1,f) == 1){
			if(id == db.id){	
				printf("\n%s %s's PROFILE\n......................\n\n",db.name,db.surname);
				
				printf("NAME: %s \n",db.name);
				printf("SURNAME: %s \n",db.surname);
				printf("AGE: %d \n",db.age);
				printf("ADDRESS: %s \n",db.address);
				printf("CONTACT: %s \n",db.contact);
				printf("NATIONALITY: %s\n",db.nationality);
				printf("CITIZENSHIP NUMBER: %s\n",db.citizenship);
				printf("E-MAIL: %s\n",db.email);
				printf("CLAIM LIMIT: %s\n",db.claimlimit);
				printf("PLAN TYPE: %s\n",db.plantype);
				printf("BALANCE: %f",db.balance);
				printf("\nDate of subscription: %d-%02d-%02d",db.year,db.month,db.day);
				getch();
				fclose(f);
				return;
			}
		}
		printf("\ncan't find such id!!! Try Again :)"); getch();
		fclose(f);
		printf("\n Do you want to continue?[y-Yes | n-No]\n");
		scanf("%c",&yn); fflush(stdin);
		if(yn == 'y'){
			search();
			return;
		}else{
			return;
		}		
//	}while(1);
	getch();
}//search feature end



//ADMIN AREA END




//USER AREA FUNCTIONALITIES START

//user start
void user(){
	
	int choice;
	do{
		header();
		printf("\n1. LogIn \t2. SignUp \t3. GoBack");
		printf("\n\nselect option : ");
		scanf("%d",&choice); fflush(stdin);
		switch(choice){
			case 1: logIn();
				return;
			case 2: signUp();
				return;
			case 3: //exit
				return;
			default: printf("\n\ninvalid option!! press enter to try again :( "); getch();
				break;	
		}
	}while(1);
}//user end

//usermenu
void menu(int uid){
	int choice;
		
	do
	{
		header();
		printf("\n\t\t\t\t (select the options as prefered)\n\n\n");
		printf("\t1. profile\t 2. subscribe \t 3. claim \t 4. Transaction History \t 5. Log Out");
		printf("\n\nselect option : ");
		scanf("%d",&choice); fflush(stdin);
		switch(choice){
			case 1:	profile(uid);
			break;
					
			case 2: newsubs(uid);
			break;
			
			case 3: //for old subscribers
				claim(uid);	
			break;
					
			case 4: history(uid);
			break;	
			
			case 5: 
			return;
			
			default: printf("\n\ninvalid option!! press enter to try again :( "); getch(); break; 
		}
	}while(1);		
}//end of user menu


//display plan
void plan(int uid){
	system("cls");
	printf("\n\t\t     ZeeMediLife Insurance Company\n");
	printf("\n\t\t ....(Insurance Plans and Services)....\n\n\n");
	
	//health insurence plans list display
	printf("\t\t <EZMediLife Health Insurence Plans>\n");
	//printf("\n\t\t...................................\n");
	printf("\n\n\t\tPlans\t    |\tPlan120|\tPlan150|\tPlan200|\n");
	printf("\n\t----------------------------------------------------------------\n");
	printf("\n\tMonthly Premium     |\t    120|\t    150|\t    200|\n\n");
	printf("\n\tAnnual Claim Limit  |\t 120000|\t 150000|\t 200000|\n\n");
	printf("\n\tLifetime Claim Limit|\t 600000|\t 750000|\t1000000|\n\n");
	
	//Age group and health insurence plan eligiblity display
	printf("\n\n\t\t <Age group and health insurence plan eligiblity>\n");	
	printf("\n\n\tAge Groups(years)|\tPlan120|\tPlan150|\tPlan200|\n");
	printf("\n\t----------------------------------------------------------------\n");	
	int i = 251,j=251,k=251;//for √ symbol
	printf("\n\t 15 days old - 20 |\t    %c |\t\t     %c |\t     %c |\n\n",i,j,k);
	printf("\n\t\t 21 - 40  |\t    X |\t\t     %c |\t     %c |\n\n",i,j);
	printf("\n\t\t 41 - 54  |\t    X |\t\t     X |\t     %c |\n",i);
	
	printf("(Press enter to continue......)");
	getch();	
}//end of plan display


//planTypesSelection

//Plan Type Yearly
void plantypeYearly(int uid){
	int choice,a;
	printf("\n\n\tSelected Plan : ");
	scanf("%d",&choice); fflush(stdin);
	if(choice == 120){
		planSub(uid);//database
	}else if(choice == 150){
		planSub(uid);
	}
	else if(choice == 200){
		planSub(uid);
	}
	else{
		printf("sorry!!! we don't have that plan :( "); getch();
	}
}

//plan Type Lifetime
void plantypeLifetime(int uid){
	int choice,a;
	printf("\n\n\tSelected Plan : ");
	scanf("%d",&choice); fflush(stdin);
	if(choice == 120){
		planSub(uid);
	}
	else if(choice == 150){
		planSub(uid);
	}
	else if(choice == 200){
		planSub(uid);
	}
	else{
		printf("sorry!!! we don't have that plan :( "); getch();
	}	
}

//PlanClaimTypes

//ageEligibity for yearly plans
void ageEligAnnual(int uid){//3
	struct userdb db;
	int age;
	FILE *f;
	header();
	printf("\n\tYou have selected Annual Claim Limit plan\n");
	f = fopen("user.txt","rb");
	
	if(f == NULL){
		printf("\n\n File cannot be opened"); getch();
		return;
	}
	
	while(fread(&db,sizeof(db),1,f) == 1){	
		if(uid == db.id){
			age = db.age;
			if(age >= 0 && age <= 20){
			//	header();
				printf("\nhello %s your age is %d, so we have 3 plans category for you\n",db.name,age);
				printf("\n\tplan 120: Annual claim limit RM 120,000\n\tplan 150: Annual claim limit RM 150,000\n\tplan 200: Annual claim limit RM 200,000\n\n");
				printf("\n\tchoose your plan by pressing\n\t.............................\n");
				printf("\n\t-> 120 for plan 120\n\t-> 150 for plan 150\n\t-> 200 for plan 200");
				fclose(f);
				plantypeYearly(uid);
				return;
			}else if(age >= 21 && age <= 40){
			//	header();
				printf("\nhello %s your age is %d, so we have 2 plans category for you\n",db.name,age);
				printf("\n\tplan 150: Annual claim limit RM 150,000\n\tplan 200: Annual claim limit RM 200,000\n\n");
				printf("\n\tchoose your plan by pressing\n\t.............................\n");
				printf("\n\t-> 150 for plan 150\n\t-> 200 for plan 200");
				fclose(f);
				plantypeYearly(uid);
				return;
			}else if(age >= 41 && age <= 54){
			//	header();
				printf("\nhello %s your age is %d, so we have 1 plans category for you\n",db.name,age);
				printf("\n\tplan 200: Annual claim limit RM 200,000\n\n");
				printf("\n\tchoose your plan by pressing\n\t.............................\n");
				printf("\n\t-> 200 for plan 200");
				fclose(f);
				plantypeYearly(uid);
				return;
			}else{
				printf("\n\nsorry!!! no plans are available for your age category :( "); getch();
				return;
			}			
		}
	}
	fclose(f);
	getch();
} //paln annual end

//ageEligibity for lifetime plans
void ageEligLifetime(int uid){//3
	header();
	printf("\n\tYou have selected Lifetime Claim Limit plan\n");
	struct userdb db;
	FILE *f;
	f = fopen("user.txt","rb");
	if(f == NULL){
		printf("Cannot open this file"); getch();
		return;
	}
	while(fread(&db,sizeof(db),1,f) == 1){
		if(uid == db.id){
			int age = db.age;
			if(age >= 0 && age <= 20){
			//	header();
				printf("\nhello %s your age is %d, so we have 3 plans category for you\n",db.name,age);
				printf("\n\tplan 120: Annual Claim Limit RM 600,000\n\tplan 150: Annual Claim Limit RM 750,000\n\tplan 200: Annual Claim Limit RM 1,000,000\n\n");
				printf("\n\tchoose your plan by pressing\n\t.............................\n");
				printf("\n\t-> 120 for plan 120\n\t-> 150 for plan 150\n\t-> 200 for plan 200");
				fclose(f);
				plantypeLifetime(uid);
				return;
			}else if(age >= 21 && age <= 40){
			//	header();
				printf("\nhello %s your age is %d, so we have 2 plans category for you\n",db.name,age);
				printf("\n\tplan 150: Annual Claim Limit RM 750,000\n\tplan 200: Annual Claim Limit RM 1,000,000\n\n");
				printf("\n\tchoose your plan by pressing\n\t.............................\n");
				printf("\n\t-> 150 for plan 150\n\t-> 200 for plan 200");
				fclose(f);
				plantypeLifetime(uid);
				return;
			}else if(age >= 41 && age <= 54){
			//	header();
				printf("\nhello %s your age is %d, so we have 1 plans category for you\n",db.name,age);
				printf("\n\tplan 200: Annual Claim Limit RM 1,000,000\n\n");
				printf("\n\tchoose your plan by pressing\n\t.............................\n");
				printf("\n\t-> 200 for plan 200");
				fclose(f);
				plantypeLifetime(uid);
				return;
			}else{
				printf("\n\nsorry!!! no plans are available for your age category :( "); getch();
				return;
			}				
		}
	}
	fclose(f);
	getch();
} //plan lifetime end



//plan choose       
void planSelect(int uid){
	int pType;
	plan(uid);//displays the plan like an ad
	healthHistory(uid);//health history
	do{
		header();	
		printf("\n\t\t\t (select the Plan type as prefered)\n\n\n");
		printf("\t1. Annual Claim Limit \t 2. Lifetime Claim Limit \t 3. goBack");	//2
		printf("\n\nselect option : "); scanf("%d",&pType); fflush(stdin);
		switch(pType){
			case 1: ageEligAnnual(uid);		
				return;
			case 2: ageEligLifetime(uid);
				return;
			case 3: return;
			default: printf("invalid option"); getch();
				break;
		}
	}while(1);
} //plan choose end
	


//new subs
void newsubs(int uid){
	FILE *f;
	struct userdb db;
	f = fopen("user.txt","rb");
	if(f == NULL){
		printf("\nfile cannot be opened"); getch();
		return;
	}
	while(fread(&db,sizeof(db),1,f) == 1 ){
		if(uid == db.id){
			if(strcmp(db.claimlimit,"Annual")==0){
				printf("You have already subscribed our %s plan",db.claimlimit); getch();
				fclose(f);
			
				return;
			}
			if(strcmp(db.claimlimit,"Lifetime")==0){
				printf("You have already subscribed our %s plan",db.claimlimit); getch();
				fclose(f);
			
				return;
			}else{
				fclose(f);	
				planSelect(uid);       //plan choose function
				return;
			}	
		}
	}			
	fclose(f);
	getch();
}

void planSub(int uid)
{	
	int choice, option;
	char a;
	struct userdb db;
	FILE *f, *ft;
	f = fopen("user.txt","rb");
	ft = fopen("tempo.txt","wb");
	char oldfileName[]= "user.txt";
	char updatedfileName[]= "tempo.txt";
	if(f == NULL){
		printf("file Can't be opened"); getch(); return;
	}
	while(fread(&db,sizeof(db),1,f)==1){	
		if(uid == db.id){			
			header();
			printf("\nID: %d",db.id);
			printf("\nName: %s",db.name);
			printf("\nSurname: %s ",db.surname);
			printf("\nAge: %d ",db.age);
			printf("\nAddress: %s ",db.address);
			printf("\nContact Number: %s",db.contact);
			printf("\nNationality: "); gets(db.nationality); fflush(stdin);
			printf("\nCitizenship Number: "); gets(db.citizenship); fflush(stdin);
			printf("\nE-mail: "); gets(db.email); fflush(stdin);
			printf("\nClaim Limit | press 1 for Annual and 2 for lifetime: ");
			scanf("%d",&choice); fflush(stdin);
			if(choice == 1){
				strcpy(db.claimlimit, "Annual");
			}else if(choice == 2){
				strcpy(db.claimlimit, "Lifetime");
			}else{
				printf("invalid option"); getch();
				fclose(f);
				fclose(ft);
				planSub(uid);
				return;
			}              
			printf("\nPlan type: "); gets(db.plantype); fflush(stdin);
			
			if(strcmp(db.claimlimit,"Annual")==0){		
				if(strcmp(db.plantype, "120")==0){
					db.balance = 120000;
				}else if(strcmp(db.plantype, "150")==0){
					db.balance = 150000;
				}else if(strcmp(db.plantype, "200")==0){
					db.balance = 200000;
				}else{
					printf("invalid plan type!!"); getch();
					fclose(f);
					fclose(ft);
					planSub(uid);
					return;
				}
			}
			else if(strcmp(db.claimlimit,"Lifetime")==0)
			{	
				if(strcmp(db.plantype, "120")==0){
					db.balance = 600000;
				}else if(strcmp(db.plantype, "150")==0){
					db.balance = 750000;
				}else if(strcmp(db.plantype, "200")==0){
					db.balance = 1000000;
				}else{
					printf("invalid plan type!!"); getch();
					fclose(f);
					fclose(ft);
					planSub(uid);
					return;
				}
			}else{
				printf("something went wrong"); getch();
				fclose(f);
				fclose(ft);
				planSub(uid);
				return;
			}
			
			printf("Balance: %f \n",db.balance);
			db.year=year();
			db.month=month();
			db.day=dd();		                 
			fwrite(&db,sizeof(db),1,ft);	
		}else
		{	
			fwrite(&db,sizeof(db),1,ft);		
		}
	}
	fclose(f);
	fclose(ft);
	printf("\nSuccessfully subscribed the plan");
	getch();
	if(remove(oldfileName)==0){
		
	}
	if(rename(updatedfileName,oldfileName)==0){
		
	}
}



//unique user id
int userId()
{
	struct userdb db;
	FILE *f;
	int biggestId = 0;
	f = fopen("user.txt","rb");
	if(f == NULL){
		printf("\n\ncan't open this file"); getch();
		return 0;
	}
		
	while(fread(&db,sizeof(db),1,f) == 1){		
		if(biggestId < db.id){
			biggestId = db.id;
		}
	}
	fclose(f);
	return (biggestId + 1);		
}
//unique user id end


// signup start
void signUp()
{
	struct userdb db;
	int len;
	char gg[7];
	FILE *f;
	f = fopen("user.txt","ab");
	if(f == NULL){
		printf("Can't open file"); getch(); return;
	}
	header();
	printf("\n\nPlease, Fill the form below :)\n\n");
	db.id = userId();
	printf("\nID: %d\n",db.id);
	printf("name : "); gets(db.name); fflush(stdin);
	printf("Surname : "); gets(db.surname); fflush(stdin);
	printf("age : "); scanf("%d",&db.age); fflush(stdin);
	if(db.age>54){
		printf("\nsorry, there is no plan for this age group for now!!!\n"); getch();
		fclose(f);
		return;
	}else if(db.age<0){
		printf("invalid age!!! try again :("); getch();
		fclose(f);
		signUp();
		return;
	}
	printf("gender[m-male | f- female]: "); gets(gg); fflush(stdin);
	if(strcmp(gg,"m")==0){
		strcpy(db.gender,"Male");
	}else if(strcmp(gg,"f")==0){
		strcpy(db.gender,"Female");
	}else{
		strcpy(db.gender,"Other");
	}
	printf("address : "); gets(db.address); fflush(stdin);
	printf("contact number : "); scanf("%s",&db.contact); fflush(stdin);
	len = strlen(db.contact);
	if(len>14){
		printf("invalid number!!! try again :("); getch();
		fclose(f);
		signUp();
		return;
	}else if(len<10){
		printf("invalid number!!! try again :("); getch();
		fclose(f);
		signUp();
		return;
	}
	
	printf("username : "); gets(db.uname); fflush(stdin);
	printf("password : "); gets(db.passwd); fflush(stdin);

	
	fwrite(&db, sizeof(db), 1, f);
	fclose(f);
	printf("\n\ncongratulations :), you are now successfully registered costumer\npress enter to continue......"); getch();
	logIn();
} //signup end

//login start
void logIn(){	
	int uid;
	char un[100], pw[100], yn;
	struct userdb db;
	FILE *f;
	f = fopen("user.txt","rb");
//	do{
		header();
		if(f == NULL){
			printf("\n\ncan't open this file"); getch();
			return;
		}
		printf("ID :"); scanf("%d",&uid); fflush(stdin);
		printf("Username :"); gets(un); fflush(stdin);
		printf("Password :"); gets(pw); fflush(stdin);
		while(fread(&db, sizeof(db), 1, f) == 1){
			if(uid  == db.id){
				if(strcmp(un, db.uname)==0){
					if(strcmp(pw, db.passwd)==0){
						header();
						printf("\n\t\t\t\t-------Welcome back %s %s-------",db.name, db.surname); getch();
						fclose(f);
						menu(uid); 
						return;
					}
				}
			}
		}	
		printf("\nInvalid Id or username or password!!!"); getch();
		fclose(f);
		printf("\n Do you want to continue?[y-Yes | n-No]\n");
		scanf("%c",&yn); fflush(stdin);
		if(yn == 'y'){
			logIn();
			return;
		}else{
			user();
			return;
		}
//	}while(1);
	getch();		
} //login end

//profile start
void profile(int uid){
	struct userdb db;
	header();
	FILE *f;
	f = fopen("user.txt","rb");
	if(f == NULL){
		printf("\n\ncan't open this file"); getch();
		return;
	}
	
	while(fread(&db, sizeof(db), 1, f) == 1){
		if(uid == db.id){	
			printf("\nUSER PROFILE\n....*.......\n\n");
			
			printf("NAME: %s \n",db.name);
			printf("SURNAME: %s \n",db.surname);
			printf("AGE: %d \n",db.age);
			printf("Gender: %s\n",db.gender);
			printf("ADDRESS: %s \n",db.address);
			printf("CONTACT: %s \n",db.contact);
			printf("NATIONALITY: %s\n",db.nationality);
			printf("CITIZENSHIP NUMBER: %s\n",db.citizenship);
			printf("E-MAIL: %s\n",db.email);
			printf("CLAIM LIMIT: %s\n",db.claimlimit);
			printf("PLAN TYPE: %s\n",db.plantype);
			printf("REMAINING BALANCE: %f",db.balance);
			printf("\nDate of subscription: %d-%02d-%02d",db.year,db.month,db.day);
			if(strcmp(db.claimlimit,"Annual")==0){
				printf("\nExpiry date: %d-%02d-%02d",db.year+1,db.month,db.day);
			}
			getch();
			fclose(f);
			return;
		}
	}
	fclose(f);
	getch();	
}   //profile end

                 
void claim(int uid){
	int choice;
	float claimAmt, rc, day, supplyCost, surgicalCost, ipd, otherCost, bal;
	struct userdb db;
	header();
	FILE *f, *ft;
	f = fopen("user.txt","rb");
	ft = fopen("tempo.txt","wb");
	char oldfileName[]="user.txt";
	char updatedfileName[]="tempo.txt";
	if(f == NULL){
		printf("can't open file"); getch();
		return;
	}
	printf("\t\t\t\t\t|claiming Prompt|\n\t\t\t\t\t-----------------\n");
	
	while(fread(&db, sizeof(db), 1, f)==1){
		if(uid==db.id){
			printf("\nFill the details below to claim your amount\n");
			printf("\n1. room charges\t2. ICU charges| \toption: ");
			scanf("%d",&choice); fflush(stdin);
			if(choice==1){
				
				if(strcmp(db.plantype,"120")==0){
					rc = 120;
				}else if(strcmp(db.plantype,"150")==0){
					rc = 150;
				}else if(strcmp(db.plantype,"200")==0){
					rc = 200;
				}
			}else if(choice==2){
				if(strcmp(db.plantype,"120")==0){
					rc = 250;
				}else if(strcmp(db.plantype,"150")==0){
					rc = 400;
				}else if(strcmp(db.plantype,"200")==0){
					rc = 700;
				}
			}else{
				printf("invalid option"); getch();
				fclose(f);
				fclose(ft);
				claim(uid);
				return;
			}	
			printf("\nNo of days stayed in hospital Room/ICU:"); scanf("%f",&day); fflush(stdin);
			printf("\nCost of hospital supplies and services: "); scanf("%f",&supplyCost); fflush(stdin);
			printf("\nSurgical fee charged: "); scanf("%f",&surgicalCost); fflush(stdin);
			printf("\nOther fees: "); scanf("%f",&otherCost); fflush(stdin);
			ipd = rc * day;
			claimAmt = ipd + supplyCost + surgicalCost + otherCost;
			
			db.claim = claimAmt;
			printf("your total claim amount is %f",db.claim); getch();
			if(claimAmt>db.balance){
				printf("\nInsufficient Balance in your account!!\nyour claimable amount is %f",db.balance); getch();
				fclose(f);
				fclose(ft);
				claim(uid);
				return;	
			}else if(claimAmt<0){
				printf("\ninvalid claim amount\nTry Again!!"); getch();
				fclose(f);
				fclose(ft);
				claim(uid);
				return;
			}else{
				db.balance = db.balance - claimAmt;
				fwrite(&db,sizeof(db),1,ft);
			}
		}
		else
		{	
			fwrite(&db,sizeof(db),1,ft);	
		}
	}
	fclose(f);
	fclose(ft);
	printf("\nsuccessfully claimed the amount :) :)\n");
	getch();

	if(remove(oldfileName)==0){
			
	}
	
	if(rename(updatedfileName, oldfileName)==0){
		
	}
		
	historyR(uid);
}


//test
void historyR(int uid){
	struct userdb db;
	FILE *f, *T;
	f = fopen("user.txt","rb");
	T = fopen("transaction.txt","ab");
	if(T==NULL){
		printf("can't open file"); getch();
		return;
	}
	while(fread(&db, sizeof(db), 1, f) == 1){
		if(uid == db.id){
			db.transId = transactionId();
			uid = db.id;
			db.claim;
			db.balance;
			db.year=year();
			db.month=month();
			db.day=dd();
			db.hrs=	hrs();	
			db.min=min();	
			fwrite(&db,sizeof(db),1,T);
		}
	}
	fclose(f);
	fclose(T);	
}



//transaction history
void history(int uid){
	struct userdb db;
	float day;
	header();
	FILE *T;
	T = fopen("transaction.txt","rb");
	if(T == NULL){
		printf("\n\ncan't open this file"); getch();
		return;
	}
	printf("\nTRANSACTION HISTORY\n...........*.......\n\n");
	printf("\ntranId\tuserId\tclaimer\tClaimAmount\tRemaining Balance\tYear\tMonth\tDay\tTime\n------\t------\t-------\t-----------\t-----------------\t----\t-----\t---\t----\n");
	while(fread(&db, sizeof(db), 1, T) == 1){
		if(uid == db.id){			
			printf("%d\t%d\t%s\t%f\t%f\t\t%d\t%02d\t%02d\t%02d:%02d\n", db.transId, db.id, db.name, db.claim, db.balance, db.year, db.month, db.day, db.hrs, db.min);		
		}
	}
	fclose(T);
	getch();
}

//transaction Id
int transactionId()
{
   	struct userdb db;
	FILE *T;
	int biggestId = 0;
	T = fopen("transaction.txt","rb");
	if(T == NULL){
		printf("\n\ncan't open this file"); getch();
		return 0;
	}
		
	while(fread(&db,sizeof(db),1,T) == 1){		
		if(biggestId < db.transId){
			biggestId = db.transId;
		}
	}
	fclose(T);
	return (biggestId + 1);		
}


void healthHistory(int uid){
	struct userdb h;
	char yn;
	header();
	FILE *f, *u;
	u = fopen("user.txt","rb");
	f = fopen("health.txt","ab");
	if(f==NULL){                 
		printf("\nCan't open file!!!");
		getch();
		return;
	}
	while(fread(&h,sizeof(h),1,u)==1){
		if(uid==h.id){
			printf("\nID: %d",uid);	
			h.hid = uid;
			printf("\nFirst, fill your health history form below(to continue): [y-Yes|n-No]");
			printf("\nAsthama: "); scanf("%c",&yn); fflush(stdin);
			if(yn == 'y'){
				strcpy(h.asthama,"YES");
			}else if(yn == 'n'){
				strcpy(h.asthama,"NO");
			}else{
				printf("\ninvalid option!!");
				fclose(f);
				fclose(u);
				healthHistory(uid);
				return;
			}
			
			printf("\nChicken Pox: "); scanf("%c",&yn); fflush(stdin);
			if(yn == 'y'){
				strcpy(h.chickenPox,"YES");
			}else if(yn == 'n'){
				strcpy(h.chickenPox,"NO");
			}else{
				printf("\ninvalid option!!");
				fclose(f);
				fclose(u);
				healthHistory(uid);
				return;
			}
			
			printf("\nAnemia: "); scanf("%c",&yn); fflush(stdin);
			if(yn == 'y'){
				strcpy(h.anemia,"YES");
			}else if(yn == 'n'){
				strcpy(h.anemia,"NO");
			}else{
				printf("\ninvalid option!!");
				fclose(f);
				fclose(u);
				healthHistory(uid);
				return;
			}
			
			printf("\nADHD:"); scanf("%c",&yn); fflush(stdin);
			if(yn == 'y'){
				strcpy(h.ADHD,"YES");
			}else if(yn == 'n'){
				strcpy(h.ADHD,"NO");
			}else{
				printf("\ninvalid option!!");
				fclose(f);
				fclose(u);
				healthHistory(uid);
				return;
			}
			
			printf("\nDiabeties: "); scanf("%c",&yn); fflush(stdin);
			if(yn == 'y'){
				strcpy(h.diabeties,"YES");
			}else if(yn == 'n'){
				strcpy(h.diabeties,"NO");
			}else{
				printf("\ninvalid option!!");
				fclose(f);
				fclose(u);
				healthHistory(uid);
				return;
			}
			
			printf("\nConstipation: "); scanf("%c",&yn); fflush(stdin);
			if(yn == 'y'){
				strcpy(h.constipation,"YES");
			}else if(yn == 'n'){
				strcpy(h.constipation,"NO");
			}else{
				printf("\ninvalid option!!");
				fclose(f);
				fclose(u);
				healthHistory(uid);
				return;
			}
			
			printf("\nGlasses/C-lens: "); scanf("%c",&yn); fflush(stdin);
			if(yn == 'y'){
				strcpy(h.glasses,"YES");
			}else if(yn == 'n'){
				strcpy(h.glasses,"NO");
			}else{
				printf("\ninvalid option!!");
				fclose(f);
				fclose(u);
				healthHistory(uid);
				return;
			}
			
			printf("\nHeart Disease: "); scanf("%c",&yn); fflush(stdin);
			if(yn == 'y'){
				strcpy(h.heart,"YES");
			}else if(yn == 'n'){
				strcpy(h.heart,"NO");
			}else{
				printf("\ninvalid option!!");
				fclose(f);
				fclose(u);
				healthHistory(uid);
				return;
			}
			
			printf("\nHepatits: "); scanf("%c",&yn); fflush(stdin);
			if(yn == 'y'){
				strcpy(h.hepatits,"YES");
			}else if(yn == 'n'){
				strcpy(h.hepatits,"NO");
			}else{
				printf("\ninvalid option!!");
				fclose(f);
				fclose(u);
				healthHistory(uid);
				return;
			}
			
			printf("\nPneumonia: "); scanf("%c",&yn); fflush(stdin);
			if(yn == 'y'){
				strcpy(h.pneumonia,"YES");
			}else if(yn == 'n'){
				strcpy(h.pneumonia,"NO");
			}else{
				printf("\ninvalid option!!");
				fclose(f);
				fclose(u);
				healthHistory(uid);
				return;
			}
			
			printf("\nUrinary Tract Infection: "); scanf("%c",&yn); fflush(stdin);
			if(yn == 'y'){
				strcpy(h.urinary,"YES");
			}else if(yn == 'n'){
				strcpy(h.urinary,"NO");
			}else{
				printf("\ninvalid option!!");
				fclose(f);
				fclose(u);
				healthHistory(uid);
				return;
			}
			
			printf("\nThyroid Disorder:"); scanf("%c",&yn); fflush(stdin);
			if(yn == 'y'){
				strcpy(h.thyroid,"YES");
			}else if(yn == 'n'){
				strcpy(h.thyroid,"NO");
			}else{
				printf("\ninvalid option!!");
				fclose(f);
				fclose(u);
				healthHistory(uid);
				return;
			}
			
			printf("\nHigh Blood Pressure: "); scanf("%c",&yn); fflush(stdin);
			if(yn == 'y'){
				strcpy(h.hbp,"YES");
			}else if(yn == 'n'){
				strcpy(h.hbp,"NO");
			}else{
				printf("\ninvalid option!!");
				fclose(f);
				fclose(u);
				healthHistory(uid);
				return;
			}
			
			printf("\nLow Blood Pressure: "); scanf("%c",&yn); fflush(stdin);
			if(yn == 'y'){
				strcpy(h.lbp,"YES");
			}else if(yn == 'n'){
				strcpy(h.lbp,"NO");
			}else{
				printf("\ninvalid option!!");
				fclose(f);
				fclose(u);
				healthHistory(uid);
				return;
			}
			
			fwrite(&h,sizeof(h),1,f);
		}
	}
	fclose(u);
	fclose(f);	
	
}


void healthS(){
	int id;
	struct userdb db;
	char yn;
	FILE *f;
	f = fopen("health.txt","rb");
//	do{
		header();	
		if(f == NULL){
			printf("\n\ncan't open this file"); getch();
			return;
		}
		printf("Enter ID: ",id); scanf("%d",&id); fflush(stdin);
		while(fread(&db,sizeof(db),1,f) == 1){
			if(id == db.hid){	
				printf("\n%s %s's HEALTH HISTORY\n.........................\n\n",db.name,db.surname);

				printf("Asthama: %s \n",db.asthama);
				printf("Chicken Pox: %s \n",db.chickenPox);
				printf("Anemia: %s \n",db.anemia);
				printf("ADHD: %s \n",db.ADHD);
				printf("Diabeties: %s\n",db.diabeties);
				printf("Constipation: %s\n",db.constipation);
				printf("Glasses/Contact lens: %s\n",db.glasses);
				printf("Heart Diseases: %s\n",db.heart);
				printf("Hepatits: %s\n",db.hepatits);
				printf("Pneumonia: %s",db.pneumonia);
				printf("\nUrinary Tract Infection: %s",db.urinary);
				printf("\nThyroid Disorder: %s",db.thyroid);
				printf("\nHigh Blood Pressure: %s",db.hbp);
				printf("\nLow Blood Pressure: %s",db.lbp);
				getch();
				return;
			}
		}
		printf("\ncan't find such id!!! Try Again :)"); getch();
		fclose(f);
		printf("\n Do you want to continue?[y-Yes | n-No]\n");
		scanf("%c",&yn); fflush(stdin);
		if(yn == 'y'){
			search();
			return;
		}else{
			return;
		}		
//	}while(1);
	getch();
}


void Ainfo(){
	header();
	FILE *f;
	struct userdb db;
	f = fopen("user.txt","rb");
	if(f == NULL){
		printf("\n\ncan't open this file"); getch();
		return;
	}
	printf("\nUSER INFORMATION\n....*...........\n\n");	
	printf("\nID\tNAME\t\tsurname\t\tAGE\tADDRESS\t\tCONTACT\t\tUSERNAME\tPASSWORD\n..\t....\t\t.......\t\t...\t.......\t\t.......\t\t........\t........\n");
			
	while(fread(&db,sizeof(db),1,f) == 1){	
		if(strcmp(db.claimlimit,"Annual")==0){
			printf("%d\t%s\t\t%s\t\t%d\t%s\t\t%s\t%s\t\t%s\n", db.id, db.name, db.surname, db.age, db.address, db.contact,db.uname,db.passwd);
		}
	}
	fclose(f);
	getch();		
}

void Linfo(){
	header();
	FILE *f;
	struct userdb db;
	f = fopen("user.txt","rb");
	if(f == NULL){
		printf("\n\ncan't open this file"); getch();
		return;
	}
	printf("\nUSER INFORMATION\n....*...........\n\n");	
	printf("\nID\tNAME\t\tsurname\t\tAGE\tADDRESS\t\tCONTACT\t\tUSERNAME\tPASSWORD\n..\t....\t\t.......\t\t...\t.......\t\t.......\t\t........\t........\n");
			
	while(fread(&db,sizeof(db),1,f) == 1){	
		if(strcmp(db.claimlimit,"Lifetime")==0){
			printf("%d\t%s\t\t%s\t\t%d\t%s\t\t%s\t%s\t\t%s\n", db.id, db.name, db.surname, db.age, db.address, db.contact,db.uname,db.passwd);
		}
	}
	fclose(f);
	getch();		
}

void BalanceRun(){
	header();
	FILE *f;
	struct userdb db;
	f = fopen("user.txt","rb");
	if(f == NULL){
		printf("\n\ncan't open this file"); getch();
		return;
	}
	printf("\nUSER INFORMATION\n....*...........\n\n");	
	printf("\nID\tNAME\t\tsurname\t\tAGE\tADDRESS\t\tCONTACT\t\tUSERNAME\tPASSWORD\n..\t....\t\t.......\t\t...\t.......\t\t.......\t\t........\t........\n");
			
	while(fread(&db,sizeof(db),1,f) == 1){	
		if(db.balance==0){
			printf("%d\t%s\t\t%s\t\t%d\t%s\t\t%s\t%s\t\t%s\n", db.id, db.name, db.surname, db.age, db.address, db.contact,db.uname,db.passwd);
		}
	}
	fclose(f);
	getch();		
}

void transaction(){
	struct userdb db;
	float day;
	float sum = 0;
	header();
	FILE *T;
	T = fopen("transaction.txt","rb");
	if(T == NULL){
		printf("\n\ncan't open this file"); getch();
		return;
	}
	printf("\nTRANSACTION HISTORY\n...........*.......\n\n");
	printf("\ntranId\tuserId\tclaimer\tClaimAmount\tRemaining Balance\tYear\tMonth\tDay\tTime\n------\t------\t-------\t-----------\t-----------------\t----\t-----\t---\t----\n");
	while(fread(&db, sizeof(db), 1, T) == 1){			
		printf("%d\t%d\t%s\t%f\t%f\t\t%d\t%02d\t%02d\t%02d:%02d\n", db.transId, db.id, db.name, db.claim, db.balance, db.year, db.month, db.day, db.hrs, db.min);
		sum = sum + db.claim;			
	}
	printf("\n.......................................................\nTotal Amount claimed by all the users is %f",sum);
	fclose(T);
	getch();
}





void Info(){
	system("cls");	
	do{
		header();
		int choice;
		printf("\n\t\t\t\t\t( Customer's Info' )");
		printf("\n__________\nEZMedilife\n__________\n\n");
		printf("\n1.Annual Subscribers \t\t2. Lifetime Plan Subscribers\t\t3. Out Of balance\t4. Transaction history\t5. GoBack");	
		printf("\n\nSelected Option : ");
		scanf("%d",&choice); fflush(stdin);
		switch(choice){
			case 1: Ainfo();
				break;
			case 2: Linfo();
				break;
			case 3: BalanceRun();
				break;
			case 4: transaction();
			break;
			case 5: 
				return;
			default :  printf("invalid input!!! try again!!!");
				break;
		}
	}while(1);	
}

void About(){
	header();
	printf("\n\n\t\t|Developed By: Arun Saru\n");
	printf("\t\t|Roll Number: NPI000088\n");
	printf("\t\t|Subject: Introduction to C-Programming\n");
	printf("\t\t|college: Infomax College Of IT and MANAGEMENT\n");
	printf("\t\t|University: Asia Pacific University oF Technology and Innovation\n");
	printf("\t\t|Hand Out Date: 2021 june 07\n");
	printf("\t\t|Hand in Date: 2021 August 15\n");
	printf("\t\t|EZMedilife Health Insurence Management System");
	getch();
}

