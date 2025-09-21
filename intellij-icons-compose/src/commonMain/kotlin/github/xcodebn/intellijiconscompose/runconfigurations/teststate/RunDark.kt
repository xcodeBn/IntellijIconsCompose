package github.xcodebn.intellijiconscompose.runconfigurations.teststate

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RunDark: ImageVector
    get() {
        if (_RunDark != null) return _RunDark!!

        _RunDark = ImageVector.Builder(
            name = "RunDark",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF499C54)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 1f)
                lineTo(10f, 6f)
                lineTo(3f, 11f)
                close()
            }
        }.build()

        return _RunDark!!
    }

private var _RunDark: ImageVector? = null

