package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val QuestiondialogDark: ImageVector
    get() {
        if (_QuestiondialogDark != null) return _QuestiondialogDark!!

        _QuestiondialogDark = ImageVector.Builder(
            name = "QuestiondialogDark",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF3592C4)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 30f)
                curveTo(23.73f, 30.00f, 30.00f, 23.73f, 30.00f, 16.00f)
                curveTo(30.00f, 8.27f, 23.73f, 2.00f, 16.00f, 2.00f)
                curveTo(8.27f, 2.00f, 2.00f, 8.27f, 2.00f, 16.00f)
                curveTo(2.00f, 23.73f, 8.27f, 30.00f, 16.00f, 30.00f)
                close()
                moveTo(14f, 26f)
                lineTo(18f, 26f)
                lineTo(18f, 22f)
                lineTo(14f, 22f)
                lineTo(14f, 26f)
                close()
                moveTo(16f, 6f)
                curveTo(12.00f, 6.00f, 9.00f, 8.32f, 9.00f, 12.00f)
                lineTo(13f, 12f)
                curveTo(13.00f, 10.17f, 13.94f, 9.00f, 16.00f, 9.00f)
                curveTo(18.06f, 9.00f, 19.00f, 10.17f, 19.00f, 12.00f)
                curveTo(19.00f, 15.33f, 14.00f, 14.58f, 14.00f, 20.00f)
                lineTo(18f, 20f)
                curveTo(18.00f, 16.25f, 23.00f, 16.17f, 23.00f, 12.00f)
                curveTo(23.00f, 8.32f, 20.00f, 6.00f, 16.00f, 6.00f)
                close()
            }
        }.build()

        return _QuestiondialogDark!!
    }

private var _QuestiondialogDark: ImageVector? = null

