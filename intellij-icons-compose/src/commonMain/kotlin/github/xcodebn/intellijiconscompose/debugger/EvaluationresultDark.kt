package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EvaluationresultDark: ImageVector
    get() {
        if (_EvaluationresultDark != null) return _EvaluationresultDark!!

        _EvaluationresultDark = ImageVector.Builder(
            name = "EvaluationresultDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 7f)
                lineTo(9f, 5f)
                lineTo(8f, 4f)
                lineTo(4f, 8f)
                lineTo(8f, 12f)
                lineTo(9f, 11f)
                lineTo(7f, 9f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _EvaluationresultDark!!
    }

private var _EvaluationresultDark: ImageVector? = null

