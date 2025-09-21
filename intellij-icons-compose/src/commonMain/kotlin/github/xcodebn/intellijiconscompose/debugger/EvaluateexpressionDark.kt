package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EvaluateexpressionDark: ImageVector
    get() {
        if (_EvaluateexpressionDark != null) return _EvaluateexpressionDark!!

        _EvaluateexpressionDark = ImageVector.Builder(
            name = "EvaluateexpressionDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 2f)
                lineTo(14f, 2f)
                lineTo(14f, 14f)
                lineTo(2f, 14f)
                lineTo(2f, 2f)
                close()
                moveTo(4f, 4f)
                lineTo(4f, 6f)
                lineTo(12f, 6f)
                lineTo(12f, 4f)
                lineTo(4f, 4f)
                close()
                moveTo(4f, 7f)
                lineTo(4f, 9f)
                lineTo(6f, 9f)
                lineTo(6f, 7f)
                lineTo(4f, 7f)
                close()
                moveTo(7f, 7f)
                lineTo(7f, 9f)
                lineTo(9f, 9f)
                lineTo(9f, 7f)
                lineTo(7f, 7f)
                close()
                moveTo(10f, 7f)
                lineTo(10f, 9f)
                lineTo(12f, 9f)
                lineTo(12f, 7f)
                lineTo(10f, 7f)
                close()
                moveTo(4f, 10f)
                lineTo(4f, 12f)
                lineTo(6f, 12f)
                lineTo(6f, 10f)
                lineTo(4f, 10f)
                close()
                moveTo(7f, 10f)
                lineTo(7f, 12f)
                lineTo(9f, 12f)
                lineTo(9f, 10f)
                lineTo(7f, 10f)
                close()
                moveTo(10f, 10f)
                lineTo(10f, 12f)
                lineTo(12f, 12f)
                lineTo(12f, 10f)
                lineTo(10f, 10f)
                close()
            }
        }.build()

        return _EvaluateexpressionDark!!
    }

private var _EvaluateexpressionDark: ImageVector? = null

