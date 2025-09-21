package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CwmleavecallDark: ImageVector
    get() {
        if (_CwmleavecallDark != null) return _CwmleavecallDark!!

        _CwmleavecallDark = ImageVector.Builder(
            name = "CwmleavecallDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(5f, 9f)
                verticalLineTo(7f)
                verticalLineTo(9f)
                lineTo(16f, 9f)
                lineTo(18f, 11f)
                close()
            }
        }.build()

        return _CwmleavecallDark!!
    }

private var _CwmleavecallDark: ImageVector? = null

