package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CwmaccessoffDark: ImageVector
    get() {
        if (_CwmaccessoffDark != null) return _CwmaccessoffDark!!

        _CwmaccessoffDark = ImageVector.Builder(
            name = "CwmaccessoffDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(10f, 5f)
                close()
                moveTo(9f, 13f)
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(13f, 10f)
                close()
                moveTo(15f, 13f)
                lineTo(12f, 11f)
                close()
                moveTo(8f, 11f)
                lineTo(11f, 14f)
                close()
            }
        }.build()

        return _CwmaccessoffDark!!
    }

private var _CwmaccessoffDark: ImageVector? = null

