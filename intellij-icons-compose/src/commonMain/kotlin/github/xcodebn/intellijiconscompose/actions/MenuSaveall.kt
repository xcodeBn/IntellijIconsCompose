package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MenuSaveall: ImageVector
    get() {
        if (_MenuSaveall != null) return _MenuSaveall!!

        _MenuSaveall = ImageVector.Builder(
            name = "MenuSaveall",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 14f)
                lineTo(11f, 11f)
                lineTo(5f, 11f)
                lineTo(5f, 14f)
                lineTo(2f, 14f)
                lineTo(2f, 2f)
                lineTo(14f, 2f)
                lineTo(14f, 14f)
                lineTo(11f, 14f)
                close()
                moveTo(4f, 4f)
                lineTo(4f, 8f)
                lineTo(12f, 8f)
                lineTo(12f, 4f)
                lineTo(4f, 4f)
                close()
                moveTo(6f, 12f)
                lineTo(10f, 12f)
                lineTo(10f, 14f)
                lineTo(6f, 14f)
                lineTo(6f, 12f)
                close()
            }
        }.build()

        return _MenuSaveall!!
    }

private var _MenuSaveall: ImageVector? = null

