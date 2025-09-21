package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CwmpermissioneditDark: ImageVector
    get() {
        if (_CwmpermissioneditDark != null) return _CwmpermissioneditDark!!

        _CwmpermissioneditDark = ImageVector.Builder(
            name = "CwmpermissioneditDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF0A732))
            ) {
                moveTo(11f, 10f)
                lineTo(13f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF0A732)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 4f)
                lineTo(13f, 3f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                lineTo(13f, 7f)
                close()
            }
        }.build()

        return _CwmpermissioneditDark!!
    }

private var _CwmpermissioneditDark: ImageVector? = null

