package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CwmaccessonDark: ImageVector
    get() {
        if (_CwmaccessonDark != null) return _CwmaccessonDark!!

        _CwmaccessonDark = ImageVector.Builder(
            name = "CwmaccessonDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(10f, 5f)
                lineTo(10f, 5f)
                close()
                moveTo(10f, 14f)
                close()
            }
        }.build()

        return _CwmaccessonDark!!
    }

private var _CwmaccessonDark: ImageVector? = null

