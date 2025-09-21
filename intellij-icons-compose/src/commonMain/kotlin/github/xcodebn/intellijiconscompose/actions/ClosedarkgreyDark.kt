package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ClosedarkgreyDark: ImageVector
    get() {
        if (_ClosedarkgreyDark != null) return _ClosedarkgreyDark!!

        _ClosedarkgreyDark = ImageVector.Builder(
            name = "ClosedarkgreyDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 4f)
                lineTo(12f, 5f)
                lineTo(9f, 8f)
                lineTo(12f, 11f)
                lineTo(11f, 12f)
                lineTo(8f, 9f)
                lineTo(5f, 12f)
                lineTo(4f, 11f)
                lineTo(7f, 8f)
                lineTo(4f, 5f)
                lineTo(5f, 4f)
                lineTo(8f, 7f)
                lineTo(11f, 4f)
                close()
            }
        }.build()

        return _ClosedarkgreyDark!!
    }

private var _ClosedarkgreyDark: ImageVector? = null

