//assignment 1

Scenarios: 

1. Hiking
 1.1. Rent a ReachNow to drive to mountain rainier on weekends with friends
 1.2. On the way, fill the gas
 1.3. On the way, eat at restaurant for lunch
 1.4. Buy the ticket to get into the park
 1.5. Book a hotel and CheckIn


   Users

        Data: Name, Phone, CreditCard
        Behavior: LoginReachNow, FindCar, UnlockCar, Drive, Park, FillGas, Eat, BuyTicket, BookHotel, CheckIn, Return, Pay, 
  
   SmartPhone

        Data: PhoneNumber
        Behavior: 

   ReachNowApp

        Data: UserLocation, CarLocation, Path, Price, CarType,
        Behavior: Sort, ShowLocation, ShowPrice, ShowCarType, Compare, SendConfirmationandInspection, Authorize

   Car

        Data: Number, Brand, Color, Type,
        Behavior: 

   CreditCard

		Data : Number, name, company, expiry, security code
		Behavior :

   CreditCardCompany

		Behavior : authorizeTransaction

   GasStation

        Data: Name, Adress, GasNumber, Price, 

   Restaurant
   
        Data: Name, Adress, Order, Price, 

   Park
        
        Data: Name, Adress, PhoneNumber, OpenTime, CloseTime, 

   Ticket      

        Data: Date, ParkName, ExpireDate, Price, ParkMap, Open&CloseTime

   
    User nick,
    ReachNowApp app,
    Car BMW,
    CreditCard card,
	CreditCarCompany visa,
    GasStation walmart,
    Restaurant food,
    Park park,
    Ticket ticket,
    ConfirmationandInspection response,


    If ReachNowApp.isAvailable
        nick.LoginReachNowAccount -> Hi,nick
        app.SearchForCars -> Number, Brand, Color, Type : bunch of CarsNearby
        BMW = Car
        nick.chooseSortBMW -> bunch of BMWNearby
        app.sortBMW by Price
        nick.choose Cheapeone -> BMW, CreditCard, Location, Price : Rent ConfirmationandInspection
        response = ConfirmationandInspection
    Else Nick.cantRentACar, display: Please check your GPS


    IF CarRunOutOfGas
        nick.findGasStation -> collection of GasStation : walmart
        Loop
            if nick.findwalmart
                break
            else GasStation = GasStation + 1
            End
            if nick.findGasStation
                if walmart = GasStation
                    break
                else GasStation = GasStation + 1
                End
            else Find it later
            End
        End
        walmart = GasStation
        nick.FillGas
        nick.Pay
    Else KeepDrive
    End

    nick.findRestaurant -> food
    if food = Restaurent 
        nick.eat
    else keep findRestaurant

    nick.GoHiking -> Park
    nick.findPark -> collection of Parks
    park = Park
    If nick.find park
        nick.gohiking
    else nick.findPark
    


2. Organise a career fair(Suppose you are the organiser)

2.1  order a room on NeuWebsite, choose time and location, choose the CareerFairType = information system 
2.2  Rent chairs and tables on Aurora
2.3  find volunteers and hire professor
2.4  Ship and set up all the chairs and tables
2.5  Send email to all the people who registered for the career fair
2.6  make namelist and start careerfair

    Organiser
 
        Data: Name, MyNeuAccount, AuroraAccout, Money, EmailAdress, 
        Behavior: Order, Choose, RentChair&Table, HireVolunteer&Professor, ShipStuffs, Notify, MakeList

    Room

        Data: location, roomNumber, Time, 

    Chairs

        Data: Number, Size, Price, Color, Type

    Tables    

        Data: Number, size, price, color, Type

    volunteers

        Data: Name, PhoneNumber, Salary, Adress
        Behavior: Setup Chairs&tables 

    Professor

        Data: Name, Major, PhoneNumber, Salary, Adress
        Behavior: Teach


    NEUAccount myneu
    ClassRoomAdress 106C
    ClassRoomTime 8am
    CareerFairType IS
    RentWebsite Aurora
    RentingConfirmation response
    Professor Lenda
    Registerpeople people

    if the organiser didt HaveAnAccount
        Creat myneu = NEUAccount 
    else Order a Classroom
        
    if ClassroomAdress = 106C
        find ClassRoomTime
        if ClassRoomTime = 8am
            Submit the order
        else Find another time Available
        
    else ChangANewClassRoom Available
    ClassroomAdress 106C = new ClassroomAdress
    ClassRoomTime 8am = new ClassRoomTime
    CareerFairType IS = new CareerFairType

    if chairs&tables not Available in School
        Rent chairs&tables on Website
        Aurora = Website
        Aurora.sort.compareChairs&Tables
        Aurora.displayChairs&Tables on Website
        if Chairs&Tables are available
            nick.rent Chairs&tables
            nick.payforthem
            aurora.shipChairs&Tables
        else nick.find other Chairs&tables
    else nick.useChairs&Tables in School

    nick.Receive chairs&tables
    nick.findVolunteers
    nick.hireProfessor
    Lenda = Professor
    volunteers.setupChairs&Tables
    
    
    people = Registerpeople
    people.register
    if Name = null || Email = null || Major Information = null
        peopleCantRegister
        alert. Please fill the blank
    else registerSuccess
    nick.sendEmailToRegisteredPeople
    people.joinTheCareerFair
    Lenda.StartTeach



3. Order Pizza from Pizza Hut

Things :

	Consumer :
		Data: Name, Address, Phone
		Behaviors : buy, search, reviews, compare, return, cancel
	
	PizzaHut App :
        
        Data : pizza, 
        Behaviors :  search, sort, display, compare , placeTheOrder
	
	Pizza
	
		Data : Price, size, name, Type, Food, Sauce
		Behavior : 
	
	CreditCard
	
		Data : Number, name, company, expiry, security code
		Behavior : 
		
	CreditCardCompany
	
		Behavior : authorizeTransaction

    consumer nick
    PizzaHutApp pizzahut 
    Pizza pizza
    CreditCard card
    CreditCardCompany visa
    ShoppingConfirmation response

    if PizzaHutApp is Available 
    nick.searchInPizzaHutApp -> pizzahut 
    nick.findPizzas ->  collection of pizzas : PizzaHutApp Webpage = 1
    Loop
        if nick.findNoPages
            break
        End
        nick.findFavoritePizzaIn pizzahut , 
        pizza = Pizza,
        if pizza is Available,
            break
        else
            PageNumber = PageNumber + 1
        End

    else nick.cantFindPizzas, Use it after a while



4. Design a code sharing platform (eg: Github).

things

    Computer

        Data: Brand, Function, Type 
        Behavior: connect, input, design

    coders
        
        Data: Account, Name, PhoneNumber, Emails, Codes, 
        Behavior: Register, Signin, Upload, Download, Copy, Modify, 

    Website

        Data: URL, Resource,  
        Behaviors: search, sort, display, Authorize

    Designers

        Data: Account, Name, Email, 
        Behaviors : design, build, run, test, Send email

    language
       
        Data: 
        Behaviors: develope, design
    
    Database

        Data: datas
        Behavior: memory, save, output

    Computer computer
    Designer nick
    Language Java
    CodeSharingPlatform github
    Database db
    Coder coder
    PlatformEmail authorize


    if computer is Available
        Java = Language
        nick.DevelopeCodeSharingPlatform -> Github
        github = CodeSharingPlatform
        nick.buildDatabase -> Database
        db = Database

        if all codes were done
            nick.runGithub -> github
            Loop
                if githubIsGood
                    break
                end
                    nick.testGithub -> github
                    Loop
                        if nick.accessTest
                            break
                        end
                        // githubCanBeUsed
                        else modify And Test + 1
                        end
                    end
                else fixTheBreakAnd Run + 1
                end
            end

        else keepCoding

        github = CodeSharingPlatform
        db = Database
        coder = Coder
        coder.register
        if Name = null || Email = null || Major Information = null
            coderCantRegister
            alert. Please fullfill the blank
        else registerSuccess
        Plantform.authorizeRegisterInformation
        if Information is correct
            github.sendEmailToCoder -> PlatformEmail
            authorize = PlatformEmail
            coders.confirmAccount
            coders.useGithub
        else coder.Register = Register + 1 
    else keepCoding


5. Design a soft-drink/snacks vending machine.

Things

    Designer

        Data: Name, Adress, PhoneNum, Email, money
        Behaviors: design, product, buy, 

    snacks

        Data: duedate, price, name, size, quailty, component, number

    vendingMachine
 
        Data: Name, size, quality, price, structure
        Behaviors: getMoney, giveoutProducts, Savemoney, count, display, Autorize

    Customers

        Data: money
        Behavious: buy, eat, choose


    Designer nick
    Snacks chips
    VendingMachine auto
    Customers customers
    Money coins
    MachineCheckMoney authorize


    if materialIsEnough
        nick.DesignAMachineChart -> designChart 
        nick.madeTheMchine -> auto
        auto = VendingMachine
        Loop 
            if auto is working
                break
            end
            nick.testTheMachine -> auto
            Loop
                if auto is good
                    break
                end
                nick.finishIt
                else Test = Test + 1

            end
            else machine = machine + 1 

        end

        if snacks is available 
            customers.buysnacks -> customersBuyChips
            customers.useCoins
            if Machine canAuthorize
                Loop
                    if coinsIsAvaialble 
                        break
                    end 
                    Machine giveCustomersFood
                    chips = Snacks
                    coustomers.getChips
                    else Machine return Coins , alert -> Coins are not available
                end
            else Machine is not working

        
        else customersCantBuySnacks alert: Come Back later

    else Waiting for the material

    
            















Tips : 
1. You may go as deep as you want , like the first scenario will be an example, you can simplify it or make it more complex.
2. Use pseudo code. This assignment has nothing to do with the real code, we want you to experience what is object oriented language. 


Success criteria:
1. Be able to parsing the daily activities into some small block and learn the way to design things. Different may have different ways to parse the same scenario. So make your own copy. 

2. Be able to make progress according to reviews from teachers and TA. 

Requirement:

1. Deadline is Sep, 15th. If you encounter any problem to meet this deadline, please contact TA or Professor directly.

2. Individual work, not team project. But can have discuss with other classmates. 
