package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DropdowngutterDark: ImageVector
    get() {
        if (_DropdowngutterDark != null) return _DropdowngutterDark!!

        _DropdowngutterDark = ImageVector.Builder(
            name = "DropdowngutterDark",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 10f)
                lineTo(13f, 13f)
                lineTo(8f, 13f)
                close()
            }
        }.build()

        return _DropdowngutterDark!!
    }

private var _DropdowngutterDark: ImageVector? = null

