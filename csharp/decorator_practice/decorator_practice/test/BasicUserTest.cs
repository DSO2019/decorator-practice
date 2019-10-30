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
    class BasicUserTest
    {
        public Mock<User> user;
        public BasicUser bu;

        [SetUp]
        public void SetUp()
        {
            bu = new BasicUser();
            user = new Mock<User>(bu);
        }

        [TestCase]
        public void NameTest()
        {
            Assert.AreEqual("Basic User", user.Object.getName());
        }
    }
}