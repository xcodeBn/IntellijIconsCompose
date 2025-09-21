package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowdownsmallDark: ImageVector
    get() {
        if (_ArrowdownsmallDark != null) return _ArrowdownsmallDark!!

        _ArrowdownsmallDark = ImageVector.Builder(
            name = "ArrowdownsmallDark",
            defaultWidth = 9.0.dp,
            defaultHeight = 5.0.dp,
            viewportWidth = 9.0f,
            viewportHeight = 5.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 0f)
                lineTo(9f, 5f)
                lineTo(0f, 5f)
                close()
            }
        }.build()

        return _ArrowdownsmallDark!!
    }

private var _ArrowdownsmallDark: ImageVector? = null

