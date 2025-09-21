package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MoveupDark: ImageVector
    get() {
        if (_MoveupDark != null) return _MoveupDark!!

        _MoveupDark = ImageVector.Builder(
            name = "MoveupDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 5f)
                lineTo(14f, 11f)
                lineTo(2f, 11f)
                close()
            }
        }.build()

        return _MoveupDark!!
    }

private var _MoveupDark: ImageVector? = null

