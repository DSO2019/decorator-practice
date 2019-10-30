using System;
using System.Collections.Generic;
using System.Text;
using decorator_practice.main.decorator;
using decorator_practice.main.users;
using Moq;
using NUnit.Framework;

namespace decorator_practice.test
{
    [TestFixture]
    class AdminUserTest
    {
        public Mock<User> user;
        public AdminUser au;

        [SetUp]
        public void SetUp()
        {
            au = new AdminUser();
            user = new Mock<User>(au);
        }

        [TestCase]
        public void NameTest()
        {
            Assert.AreEqual("Admin", user.Object.getName());
        }
    }
}
