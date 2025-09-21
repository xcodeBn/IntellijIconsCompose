package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MenuSaveallDark: ImageVector
    get() {
        if (_MenuSaveallDark != null) return _MenuSaveallDark!!

        _MenuSaveallDark = ImageVector.Builder(
            name = "MenuSaveallDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
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

        return _MenuSaveallDark!!
    }

private var _MenuSaveallDark: ImageVector? = null

