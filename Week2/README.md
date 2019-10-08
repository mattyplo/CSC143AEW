This week we will continue building classes based off of our automobile example. However, we are
going to step up our game and refactor! We will be applying the concepts of abstract classes and
interfaces. We will refactor our first weeks example so that an automobile is no longer a concrete class
but rather an abstract class. And we will build two different interfaces for our cars, electric cars and gas
cars.
We create an abstract Automobile class because it is a broad class class that encompasses a whole set of
sub classes. Automobiles can include trucks, cars, SUVs, Off road vehicles and so on. However, in order
to construct an Automobile we need to designate more specifically what type of automobile it is we are
going to construct. We don’t simply build an automobile, we build a car. The automobile is a class that
many classes inherit and share from, but doesn’t exist on it’s own in the wild.
We create interfaces for electric vehicles and gas vehicles so we can further specify a type of vehicle
we’d like to create. A Tesla is an electric vehicle. It needs to charge its battery, and how it does so is up
to it’s designers. A Tesla is not a gas vehicle, and so has no need to implement any gas vehicle features.
Meanwhile, a Toyota Yaris is a gas vehicle and not an electric vehicle and must implement gas vehicle
features. Both Teslas’ and Yaris’ are Cars which are Automobiles, and as such will behave like Cars and
Automobiles.
This weeks challenge:
Refactor our Automobile class so that it is an abstract class
Introduce two Interface types, electricVehicle and gasVehicle
Refactor and or introduce new car class that extend our abstract classes and implement our new
interfaces.
Create Client car that instantiates our new classes
