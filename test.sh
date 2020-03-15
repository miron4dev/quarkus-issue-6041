#!/bin/bash

./gradlew clean build
sam local invoke -e event.json