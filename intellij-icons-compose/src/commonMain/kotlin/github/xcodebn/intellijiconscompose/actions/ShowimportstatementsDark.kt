package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ShowimportstatementsDark: ImageVector
    get() {
        if (_ShowimportstatementsDark != null) return _ShowimportstatementsDark!!

        _ShowimportstatementsDark = ImageVector.Builder(
            name = "ShowimportstatementsDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 6f)
                lineTo(9f, 6f)
                lineTo(9f, 12f)
                lineTo(12f, 12f)
                lineTo(12f, 14f)
                lineTo(4f, 14f)
                lineTo(4f, 12f)
                lineTo(7f, 12f)
                lineTo(7f, 8f)
                lineTo(5f, 8f)
                lineTo(5f, 6f)
                close()
                moveTo(6f, 2f)
                lineTo(9f, 2f)
                lineTo(9f, 4f)
                lineTo(6f, 4f)
                lineTo(6f, 2f)
                close()
            }
        }.build()

        return _ShowimportstatementsDark!!
    }

private var _ShowimportstatementsDark: ImageVector? = null

