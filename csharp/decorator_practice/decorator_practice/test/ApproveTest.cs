using System;
using System.Collections.Generic;
using System.Text;
using decorator_practice.main.decorator;
using decorator_practice.main.privileges;
using decorator_practice.main.users;
using Moq;
using NUnit.Framework;

namespace decorator_practice.test
{
    [TestFixture]
    class ApproveTest
    {
        public Mock<User> user;

        [SetUp]
        public void SetUp()
        {
            user = new Mock<User>();
        }

        [TestCase]
        public void NameTest()
        {
            User approve = new Approve(user.Object);
            Assert.AreEqual("Any Name approve", user.Object.getPrivileges());
        }
    }
}
