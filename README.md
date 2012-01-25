Sample Play! Framework repository structure
=============
This is a possible structure for our Play! framework project. Do not construe this as a mandate or even 
interpret it as a good idea! It's just my messing around with stuff as a learning exercise and a way to 
share my thinking in progress. 

Note that since this is a public Git repo, I'm not putting anything specific to our real world app in 
here, just sample stuff that uses the technologies/parts we are getting started with.

Goals
-----------
- make it as easy as possible to get teammembers going in a new dev/design environment 
- provide as much consistency as possible across different dev environments (hence I made the possibly questionable decision to check in the Play! files themselves)
- be organized/tidy/all that good stuff

Setup/Getting Started
----------------
- Check out this repository
- If you don't have it, install Java (do we care which version on dev machines?)
- Add the play-1.2.2 directory to your path
- Launch our app from the command line-- navigate to the directory that this file lives in and run 
	play ourPlayApp
- Browse to [http://localhost:9000](http://localhost:9000) in a browser. If it looks like a nice web page, then Bob's yer uncle!

Directory Structure/Organization
-----------------
I found this [Anatomy of a Play 2.0 application](https://github.com/playframework/Play20/wiki/Anatomy) to be a 
useful resource, but not entirely relevant for us.

At the top level, there are two directories:

	└ ourPlayApp
	└ play-1.2.2

The thought here was to facilitate checkout of the app without the play framework (since I know someone's gonna hate the
fact that I checked it in.) In the future, we might want to have other independent-ish stuff like "docs" or "mockups" at
this level-- perhaps?

Within ourPlayApp there's a general Play! convention of putting static files into the "public" directory. I'm following
this convention but changed the default directory structure to give more structure to our client-side code files, thus:

	ourPlayApp
		└ public
			└ html
			└ images
			└ ext              → external includes, stuff like jquery, require, etc.
			└ scripts          → can be .coffee or .js files should get further broken down as we organize our client-side code
			└ css              → these are actual css files, as opposed to SASS or LESS (which will go into the app) folder


What's included (please update this doc if you add more)
-------------------
- play-1.2.2
    - scala module (installed but not used in the app yet. Need to figure out how to mix/match java & scala code.
