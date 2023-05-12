'''malasian bank online loan management system'''

#function defination Area

#header start
def header():
  clear()
  print("\n\t\t\tMalaysia Bank Online Loan Management System")
  print("\t\t\t   (please select your prefered option)\n\n") 
#header end

#clear
from os import system, name
from time import sleep         #to show output for some seconds

def clear():
    if name == 'nt':
        _ = system('cls')
    else:
        _ = system('clear')
#clear End

#userData start
def userData():
  fp = open("data.txt","r") #read from registered userdata
  header()
  for i in fp:
    print(i, end="")
  fp.close()
  choice = int(input("press 1 to go back or you will be redirected in 120 seconds: "))
  if choice == 1:
    admin()
    return
  else:
    sleep(120)
    admin()
    return
#userData end

#(index page)main Area Start
def indexPage():
  header()
  print("1. Admin\t 2. User\t \t3. Exit\n")
  choice = int(input("Selected Option: "))
  if choice == 1:
    authentication()
  elif choice == 2:
    umenu()
  elif choice == 3:
    header()
    print("\nThanks for using Application")
    print("\nDeveloped by Arun Saru\nTP: NPI000088\nFaculty: B.Sc IT\nInfomax college of IT and Management\nAsia pacific university")
    sleep(7)
  else:
    print("invalid option!!")
#index end

#list of un approved user
def listunapprove():
    f = open("user.txt", "rt")
    for a in f:
      print(a, end="")
    f.close()

#remove user approved file
def rem():
  import os
  os.remove("user.txt")

#write balance
def balance():
  f = open("balance.txt","a")
  Id = input("ID: ")
  balance = input("Balance:")
  f.write(str(Id))
  f.write("\t")
  f.write(str(balance))
  f.write("\n")
  f.close()
   

#change status
def changeStatus():
    header()
    f = open("user.txt", "rt")
    ft = open("data.txt","at")
    listunapprove()
    name = input("\nEnter name to be approve: ")
    check = False
    for i in f:
        for j in i.split():
            if j == name:
                check = True
        if check== True:
            a=i.replace("NR","R")
            ft.writelines(a)
            print("\nCustomer Approved Successfully :)")
            sleep(2)
            break
    f.close()
    ft.close()
    rem() 
    balance()
    admin()



#user search by id
def search():
    header()
    f = open("data.txt","rt")
    id = input("Enter id:")
    for i in f:
        for j in i.split():
          if j == id:
            print(i)
            choice = int(input("\npress 1 to exit: "))
            if choice == 1: 
              admin()
              return
            else:
              sleep(200)
    f.close()

#users transaction history
def thistory():
  fp = open("transaction.txt","r") #read from registered userdata
  header()
  print("Id\tEMI\tDate\n..\t...\t....")
  for i in fp:
    print(i, end="")
  fp.close()
  choice = int(input("press 1 to go back or you will be redirected in 120 seconds: "))
  if choice == 1:
    admin()
    return
  else:
    sleep(120)
    admin()
    return

#display history by Id
def Ihistory():
    header()
    f = open("transaction.txt","rt")
    id = input("Enter id:")
    print("Id\tEMI\tDate\n..\t...\t....\n")
    for i in f:
        for j in i.split():
          if j == id:
            print(i)
    f.close()
    choice = int(input("\npress 1 to exit: "))
    if choice == 1: 
      admin()
      return
    else:
      sleep(200)

#transaction history menu
def transactions():
  header()
  print("1. By ID\t2. All History\t3. Back")
  choose = int(input("\nSelected Option: "))
  if choose == 1:
    Ihistory()
  elif choose == 2:
    thistory()
  elif choose == 3:
    admin()
    return


#Admin
def admin():
  header()
  print("1. UserData\t2. Search\t3. change status\t4. transactions\t5. Back")
  choose = int(input("\nSelected Option: "))
  if choose == 1:
    userData()
  elif choose == 2:
    search()
  elif choose == 3:
    changeStatus()
  elif choose == 4:
    transactions()
  elif choose == 5:
    indexPage()
    return

#adminEnd
#authentication
def authentication():
  while 1==1:
    header()
    uname = input("Enter your username : ")
    password = input("Enter your password : ")
    if uname == "admin" :
      if password == "admin123" :
        print("welcome :)")
        admin()
        break
      else:
        print("invalid password :(")
    else:
      print("invalid username :(")
    yn = input("Do you want to continue?[y-Yes | n-No]: ")
    if yn == "y":
      continue
    else:
      indexPage()
      break
      
  #authentication End


#Loan calculator function
def loanCalc():
 header()
 print("\nLoan Calculator\n")
 loanAmt = float(input("Enter Loan Amount : "))
 interest = float(input("Enter Annual Interest Rate : "))
 print("Loan Terms:")
 term = int(input("1. for Yearly\t2. for Monthly\nSelected Option:  "))
 if term == 1:
    yearOfLoan = float(input("Loan term | Year:"))
    monthly = yearOfLoan * 12
    ratePerMonth = interest / (100 * 12)
    numerator = loanAmt * ratePerMonth * (1 + ratePerMonth)**monthly
    denominator = ((1 + ratePerMonth)**monthly) - 1
    monthlyPayment = numerator/denominator
    print("Your montly payment for your loan",loanAmt,"for time period",yearOfLoan,"year is",monthlyPayment,"\n")
 elif term == 2:
    monthly = float(input("Loan term | month:")) 
    ratePerMonth = interest / (100 * 12)
    numerator = loanAmt * ratePerMonth * (1 + ratePerMonth)**monthly
    denominator = ((1 + ratePerMonth)**monthly) - 1
    monthlyPayment = numerator/denominator
    print("\nYour montly Installment for your loan",loanAmt,"for time period",monthly,"month is",monthlyPayment,"\n")
 else:
    print("Invalid Input!!!")
#calcEnd

# Education loan
def EL():
    header()
    print("\t\t\t\t   ----Personal Loan----") 
    print(" ---------- ")
    print("| FEATURES |")
    print(" ---------- ")
    print("\n> Fixed Monthly Installment")
    print("\nLoan Amount\n___________")
    print("\n> Minimum Loan amount RM 5000")
    print("\n> Maximum Loan amount RM 200,000")
    print("\nLoan Term\n_________")
    print("\n> Minimum Loan Term 6 months")
    print("\n> Maximum Loan Term 6 years\n")
    print("\nInterest Rate\n_____________")
    print("\n> 4% per annum fixed rate for loan amount of RM 5000 to RM 20,000")
    print("\n> 2% per annum fixed rate for loan amount of RM 20,001 to RM 50,000")
    print("\n> 1.5% per annum fixed rate for loan amount of RM 50,001 to RM 200,000")
    exit()

#Personal Loan
def PL():
    header()
    print("\t\t\t\t   ----Personal Loan----") 
    print(" ---------- ")
    print("| FEATURES |")
    print(" ---------- ")
    print("\n> Fixed Monthly Installment")
    print("\nLoan Amount\n___________")
    print("\n> Minimum Loan amount RM 5000")
    print("\n> Maximum Loan amount RM 100,000")
    print("\nLoan Term\n_________")
    print("\n> Minimum Loan Term 6 months")
    print("\n> Maximum Loan Term 6 years\n")
    print("\nInterest Rate\n_____________")
    print("\n> 8% per annum fixed rate for loan amount of RM 5000 to RM 20,000")
    print("\n> 7% per annum fixed rate for loan amount of RM 20,001 to RM 50,000")
    print("\n> 6.5% per annum fixed rate for loan amount of RM 50,001 to RM 100,000")
    exit()

#Car loan
def CL():
    header()
    print("\t\t\t\t   ----Car Loan----") 
    print(" ---------- ")
    print("| FEATURES |")
    print(" ---------- ")
    print("\n> Fixed Monthly Installment")
    print("\nLoan Amount\n___________")
    print("\n> Minimum Loan amount RM 30000")
    print("\n> Maximum Loan amount RM 1200,000")
    print("\nLoan Term\n_________")
    print("\n> Minimum Loan Term 6 months")
    print("\n> Maximum Loan Term 6 years\n")
    print("\nInterest Rate\n_____________")
    print("\n> 10% per annum fixed rate for loan amount of RM 5000 to RM 30,000")
    print("\n> 13% per annum fixed rate for loan amount of RM 20,001 to RM 50,000")
    print("\n> 5.5% per annum fixed rate for loan amount of RM 50,001 to RM 1200,000")
    exit()

#Home Loan
def HL():
    header()
    print("\t\t\t\t   ----Personal Loan----") 
    print(" ---------- ")
    print("| FEATURES |")
    print(" ---------- ")
    print("\n> Fixed Monthly Installment")
    print("\nLoan Amount\n___________")
    print("\n> Minimum Loan amount RM 5000")
    print("\n> Maximum Loan amount RM 900,000")
    print("\nLoan Term\n_________")
    print("\n> Minimum Loan Term 6 months")
    print("\n> Maximum Loan Term 6 years\n")
    print("\nInterest Rate\n_____________")
    print("\n> 8% per annum fixed rate for loan amount of RM 5000 to RM 20,000")
    print("\n> 7% per annum fixed rate for loan amount of RM 20,001 to RM 50,000")
    print("\n> 6.5% per annum fixed rate for loan amount of RM 50,001 to RM 900,000")
    exit()

#profile loan detail
def pEL(id): 
  print("\nInterest Rate\n_____________")
  print("\n> 4% per annum fixed rate for loan amount of RM 5000 to RM 20,000")
  print("\n> 2% per annum fixed rate for loan amount of RM 20,001 to RM 50,000")
  print("\n> 1.5% per annum fixed rate for loan amount of RM 50,001 to RM 200,000")
  pexit(id)

def pCL(id):
  print("\nInterest Rate\n_____________")
  print("\n> 10% per annum fixed rate for loan amount of RM 5000 to RM 30,000")
  print("\n> 13% per annum fixed rate for loan amount of RM 20,001 to RM 50,000")
  print("\n> 5.5% per annum fixed rate for loan amount of RM 50,001 to RM 1200,000")
  pexit(id)

def pPL(id):
  print("\nInterest Rate\n_____________")
  print("\n> 8% per annum fixed rate for loan amount of RM 5000 to RM 20,000")
  print("\n> 7% per annum fixed rate for loan amount of RM 20,001 to RM 50,000")
  print("\n> 6.5% per annum fixed rate for loan amount of RM 50,001 to RM 100,000")
  pexit(id)

def pHL(id):
  print("\nInterest Rate\n_____________")
  print("\n> 8% per annum fixed rate for loan amount of RM 5000 to RM 20,000")
  print("\n> 7% per annum fixed rate for loan amount of RM 20,001 to RM 50,000")
  print("\n> 6.5% per annum fixed rate for loan amount of RM 50,001 to RM 900,000")
  pexit(id)

#Loan Details
def loanDetail():
  header()
  print("\nLOAN DETAILS\n")
  print("1. Education Loan(EL) \t 2. Car Loan(CL) \t3. Home Loan(HL) \t4. Personal Loan(PL)\n5. Exit")
  choice = int(input("\nSelected Option : "))
  if choice == 1:
    header()
    EL() 
  elif choice == 2:
    header()
    CL() 
  elif choice == 3:
    header()
    HL()
  elif choice == 4:
    PL()
  elif choice == 5:
    header()
    print(" ")
    newCostumer()
  else:
    header()
    print("invalid option :(") 
#loanDetail end

#Exit loan detail
def exit():
  print("\n")
  choice = int(input("press 3 to exit: "))
  if choice == 3:
      print("\nExiting...")
      sleep(1)
      loanDetail()
  else:
      print("\nredirecting to loanDetail in 10 seconds....")
      sleep(10)

#Exit PLoandetail
def pexit(id):
  print("\n")
  choice = int(input("press 3 to exit: "))
  if choice == 3:
      print("\nExiting...")
      sleep(1)
      rcustom(id)
      return
  else:
      print("\nredirecting to user menu in 10 seconds....")
      sleep(10)


#collect new costumer data
def collectUserData():
  data = []
  import random
  a = str((random.randint(1,1000)))
  print("Your Id id: ", a)
  data.append(a)
  name = input("Name: ")
  data.append(name)
  address = input("Address: ")
  data.append(address)
  email = input("Email: ")
  data.append(email)
  contact = input("Contact Number: ")
  data.append(contact)
  g = input("Enter Gender: ")
  data.append(g)
  dob = input("Enter Date Of Birth(yyyy/mm/dd): ")
  data.append(dob)
  loanType = input("Loan Type(EL/CL/HL/PL): ")
  data.append(loanType)
  loanTerm = input("Loan Term(year): ")
  data.append(loanTerm)
  loanAmt = input("Loan Amount: ")
  data.append(loanAmt)
  EMI = input("Enter monthly installment: ")
  data.append(EMI)
  userName = input("Username: ")
  data.append(userName)
  while(1):
    password = input("enter password: ")
    rPass = input("Rewrite password: ")
    if password == rPass:
      data.append(password)
      break
    else:
      print("password didn't match")
  status = "NR"
  data.append(status)
  from datetime import date
  today = str(date.today())
  data.append(today)
  return data
#collect data end

#register costumer
def saveUserData():
  fp = open("user.txt","a")
  details = collectUserData()
  for i in range(len(details)):
    fp.write(details[i]+" ")
  fp.write("\n")
  fp.close()
#End of register new costumer




#new costumer menu function
def newCostumer():
  header()
  print("\t1. Loan Details\t\t 2. Loan Calculator\t 3. Register\t \t4. Exit\n")
  choice = int(input("\nSelected Option : "))
  if choice == 1:
    loanDetail()  
  elif choice == 2:
    loanCalc() #loanCalcFunction
    print("\nRedirecting to new costumer menu in 15 seconds")
    sleep(15)
    newCostumer()
  elif choice == 3:
    header()
    print("Fill the form below:")
    saveUserData()
    header()
    print("\ncongratulations you are registered as our valued costumer :) :)")
    sleep(2)
    umenu()
  elif choice == 4:
    umenu() 
  else:
    print("invalid option :(") 
#NewCostumer menu End

#loanDetail user
def loanDtl(id):
  f = open("data.txt","rt")
  a = False
  for i in f:
    for j in i.split():
      if j == id:
        a= True
      if a == True:
        if j == "EL":
            pEL(id)
            return
        elif j == "CL":
            pCL(id)
            return
        elif j == "HL":
            pHL(id)
            return
        elif j == "PL":
            pPL(id)
            return
  f.close()

#transaction history
def history(id,Emi):
  f = open("transaction.txt","a")
  f.write(str(id))
  f.write("\t")
  f.write(str(Emi))
  f.write("\t")
  from datetime import date
  today = date.today()
  f.write(str(today))
  f.write("\n")
  f.close()
  print("\nEMI paid successfully :) :)")
  sleep(1)
   


#pay
def pay(id):
  header()
  f = open("balance.txt","r")
  Emi = int(input("Enter your EMI amount: "))
  check = False
  e = 0
  val = 0
  for i in f:
    count = 0
    for j in i.split(): 
      count = count+1
      if j == id:
        check = True
      if check == True:
        if count == 2:
          val = int(j)
          e = val-Emi
          break
  f.close()
  f = open("balance.txt","r")
  fd = f.read()
  fd = fd.replace(str(val),str(e))
  wr = open("balance.txt","w")
  wr.write(fd)
  wr.close()
  f.close()
  history(id,Emi)
  rcustom(id)
  return

#Profile
def Profile(id):
    header()
    f = open("data.txt","rt")
    for i in f:
        for j in i.split():
          if j == id:
            a = i.split()
            print(a,end=" ")
            choice = int(input("\npress 1 to exit: "))
            if choice == 1: 
              rcustom(id)
              return
            else:
              sleep(200)
    f.close()

#user page transaction history display
def transaction(id):
  header()
  f = open("transaction.txt","rt")
  print("Id\tEMI\tDate\n..\t...\t....")
  for i in f:
    for j in i.split():
      if j == id:
        print(i)
  f.close() 
  choice = int(input("\npress 1 to exit: "))
  if choice == 1: 
    rcustom(id)
    return
  else:
    sleep(200) 

#loan Status
def Lstatus(id):
  f = open("balance.txt","rt")
  check = False
  for i in f:
    count = 0
    for j in i.split():
      count = count + 1
      if j == id:
        check = True
      if check == True:   
        if count == 2 :
          print("YOUR REMAINING DEBT IS: ",j)
          sleep(4)
          rcustom(id)
          return
  f.close()
 

#function defination area end
#registered customer
def rcustom(id):
  header()
  print("1. Loan Detail\t2. Pay\t3. Transaction\t4. Profile\t5.Loan Status\t6. Back")
  choose = int(input("\nSelected Option: "))
  if choose == 1:
     loanDtl(id)
  elif choose == 2:
    pay(id)
  elif choose == 3:
    transaction(id)
  elif choose == 4:
    Profile(id)
  elif choose == 5:
    Lstatus(id)
  elif choose == 6:
    umenu()
    return
  else:
    print("\nInvalid option!!!")
    sleep(1)
    rcustom(id)

#auth
def auth(id,name,password):
  f = open("data.txt","rt") 
  for i in f:
      uid = 0
      un = 0
      pw = 0
      ru = 0
      for j in i.split():
        if j == id:
          uid = 1
        if j == name:
            un = 1 
        if j == password:
            pw = 1
        if j == "R":
            ru = 1
        if uid==1 and un==1 and pw==1 and ru==1:
          print("login success")
          rcustom(id)
          return
  f.close()  
  print("\n\nDo  you want to continue? [y-menu | n-Exit]")
  opt = input("Selected Option: ")
  if opt == "y":
    umenu()
  else:
    header()
    print("\nThanks for using Application")
    print("\nDeveloped by Arun Saru\nTP: NPI000088\nFaculty: B.Sc IT\nInfomax college of IT and Management\nAsia pacific university")
    sleep(7)
    


#Dashboard menu
def umenu():
  header()
  print("1. LogIn\t 2. SignUp \t 3. Back\n")
  choice = int(input("Selected Option : "))
  if choice == 1:
    header()
    id = input("Enter your an user ID: ")
    name= input("enter username: ")
    password = input("enter password: ")
    auth(id,name,password)
  elif choice == 2:
    newCostumer()
  elif choice == 3:
    header()
    print("thankyou for using this application :) :)")
    indexPage()
  else:
    print("invalid option :(")
#menu end




    

#main
indexPage()





