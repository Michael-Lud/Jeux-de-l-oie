# Makefile pour le tp du jeu de l'oie

# Variables

%:
	@:


SRC_DIR := src
CLASS_DIR := classes
TEST_DIR := test
DOC_DIR := doc
JUNIT_JAR := junit-console.jar
MAIN_CLASS := goosegame.MainOie
BS_JAR := MainOie.jar

# Arguments passes au programme

ARGS := 

.PHONY: all compile doc jar run runjar test clean

# Cible par défaut
all : compile

# Compilation des sources goosegame

compile:
	@echo "Compilation des sources goosegame..."
	javac -sourcepath $(SRC_DIR) $(SRC_DIR)/goosegame/*.java -d $(CLASS_DIR)
	@echo "Compilation des sources du sous package cells de goosegame"
	javac -sourcepath $(SRC_DIR) $(SRC_DIR)/goosegame/cells/*.java -d $(CLASS_DIR)

# Génération de la documentation
doc:
	@echo "Génération de la documentation de goosegame..."
	javadoc -sourcepath $(SRC_DIR) -subpackages goosegame -d $(DOC_DIR)

# Création du jar exécutable
jar: compile
	@echo "Création du jar goosegame..."
	jar cvfe $(BS_JAR) $(MAIN_CLASS) -C $(CLASS_DIR) .

# Exécution avec classes compilées
run:
	@echo "Exécution goosegame..."
	java -classpath $(CLASS_DIR) $(MAIN_CLASS) $(ARGS) $(filter-out $@,$(MAKECMDGOALS))

# Exécution via jar
runjar:
	@echo "Exécution goosegame via jar..."
	java -jar $(BS_JAR) $(ARGS)

# Compilation et exécution des tests
test:
	@echo "Compilation des tests goosegame..."
	javac -classpath $(JUNIT_JAR):$(CLASS_DIR) $(TEST_DIR)/goosegame/*.java

# Nettoyage
clean:
	@echo "Nettoyage..."
	rm -rf $(CLASS_DIR)/*
	rm -rf $(DOC_DIR)/*
	rm -f $(BS_JAR)
