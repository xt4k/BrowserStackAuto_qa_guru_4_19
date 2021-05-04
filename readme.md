Mini project use Allure and provide Video/Screenshot/PageCode in test reports.
Here used Owner lib for different mobile platforms. -Denv=ios/android (iOS/android devices)

Different test modes:
Run tests with "short" syntax for iOS devices:
gradle clean -Denv=ios ios2_tests

Run tests with "short" syntax for Android devices:
gradle clean -Denv=android android_tests

Run tests with "original" syntax for iOS devices:
gradle clean -Denv=ios original_ios

Run tests with "original" syntax for Android devices:
gradle clean -Denv=android original_android
added allure notif