SRC_DIR=src/main/java
PKG_PATH=com/duffy/rectangleapp
CLASS=RectangleCalculator

all:
	cd $(SRC_DIR) && javac $(PKG_PATH)/$(CLASS).java

run: all
	cd $(SRC_DIR) && java com.duffy.rectangleapp.$(CLASS)

clean:
	find $(SRC_DIR) -name "*.class" -delete
